package com.meli.obterdiploma.integration.controller.crud;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.obterdiploma.dtos.AlunoDTO;
import com.meli.obterdiploma.models.Subject;
import com.meli.obterdiploma.services.AlunoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import java.util.Arrays;
import java.util.List;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AlunoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AlunoService alunoService;

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void shouldReturnDiploma() throws Exception {

        AlunoDTO aluno = generateAlunoDTO();
        String payload = objectMapper.writeValueAsString(aluno);

        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                    .contentType("application/json")
                    .content(payload)
        ).andExpect(status().isCreated())
        .andExpect(content().json("{\"message\":\"Sua média foi de 9.5\",\"average\":9.5,\"student\":{\"nome\":\"nathan formentin\",\"notas\":[{\"subject\":\"matematica\",\"note\":10.0},{\"subject\":\"portugues\",\"note\":9.0}]}}"));
    }

    @Test
    public void shouldReturnBadRequestDueToNullName() throws Exception {
        AlunoDTO aluno = new AlunoDTO();
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturnBadRequestDueToSmallSubjectName() throws Exception {
        List<Subject> subjectList = Arrays.asList(
                new Subject("a", 9.0),
                new Subject("b", 10.0));
        AlunoDTO aluno = new AlunoDTO("nathan formentin", subjectList);
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturnBadRequest_NoScores() throws Exception {
        List<Subject> subjectList = Arrays.asList(
                new Subject("a", null),
                new Subject("b", null));
        AlunoDTO aluno = new AlunoDTO("nathan formentin", subjectList);
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturnCreated_ScoresEqualsToZero() throws Exception {
        List<Subject> subjectList = Arrays.asList(
                new Subject("matematica", 0.0),
                new Subject("ciencias sociais", 0.0));
        AlunoDTO aluno = new AlunoDTO("nathan formentin", subjectList);
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isCreated());
    }

    @Test
    public void shouldReturnCreated_ScoresEqualsToTen() throws Exception {
        List<Subject> subjectList = Arrays.asList(
                new Subject("matematica", 10.0),
                new Subject("portugues", 10.0));
        AlunoDTO aluno = new AlunoDTO("nathan formentin", subjectList);
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isCreated());
    }

    @Test
    public void shouldReturnBadRequest_NegativeScores() throws Exception {
        List<Subject> subjectList = Arrays.asList(
                new Subject("matematica", -1.0),
                new Subject("portugues", -1000.0));
        AlunoDTO aluno = new AlunoDTO("nathan formentin", subjectList);
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturnBadRequest_ScoresGreaterThanTen() throws Exception {
        List<Subject> subjectList = Arrays.asList(
                new Subject("a", 5000.0),
                new Subject("b", 5.0));
        AlunoDTO aluno = new AlunoDTO("nathan formentin", subjectList);
        String payload = objectMapper.writeValueAsString(aluno);
        mockMvc.perform(MockMvcRequestBuilders.post("/analyzeNotes")
                .contentType("application/json")
                .content(payload)
        ).andExpect(status().isBadRequest());
    }




    private AlunoDTO generateAlunoDTO() {
        List<Subject> subjectList = Arrays.asList(
                new Subject("portugues", 9.0),
                new Subject("matematica", 10.0));
        return new AlunoDTO("nathan formentin", subjectList);
    }


}
