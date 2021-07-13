import com.meli.obterdiploma.dtos.AlunoDTO;
import com.meli.obterdiploma.dtos.analiseAlunoDTO;
import com.meli.obterdiploma.models.Subject;
import com.meli.obterdiploma.services.AlunoService;
import org.junit.jupiter.api.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CertificateServiceImplTest {

    @Test
    void shouldHaveAverageNineDotFive() {
        //arrange
        AlunoService alunoService = new AlunoService();
        Subject nota1 = new Subject("materia1", 9.0);
        Subject nota2 = new Subject("materia2", 10.0);
        List<Subject> subjectList = Arrays.asList(nota1, nota2);
        AlunoDTO aluno = new AlunoDTO("nathan", subjectList);

        //act & assert
        assertEquals(alunoService.imprimeAnaliseDiploma(aluno).getAverage(), 9.5);
    }

    @Test
    void shouldThrowInvalidArgException() {
        AlunoService alunoService = new AlunoService();
        Subject nota1 = new Subject("materia1", 9.0);
        Subject nota2 = new Subject("materia2", 10.0);
        List<Subject> subjectList = Arrays.asList(nota1, nota2);
        AlunoDTO aluno = new AlunoDTO(null, subjectList);
        assertThrows(MethodArgumentNotValidException.class, () -> alunoService.imprimeAnaliseDiploma(aluno));
    }

    @Test
    void shouldHaveNameNathan() {
        AlunoService alunoService = new AlunoService();
        Subject nota1 = new Subject("materia1", 9.0);
        Subject nota2 = new Subject("materia2", 10.0);
        List<Subject> subjectList = Arrays.asList(nota1, nota2);
        AlunoDTO aluno = new AlunoDTO("nathan", subjectList);
        assertEquals(alunoService.imprimeAnaliseDiploma(aluno).getStudent().getNome().toLowerCase(Locale.ROOT), "nathan");
    }

    @Test
    void objectsShouldBeTheSame() {
        AlunoService alunoService = new AlunoService();
        Subject nota1 = new Subject("materia1", 9.0);
        Subject nota2 = new Subject("materia2", 10.0);
        List<Subject> subjectList = Arrays.asList(nota1, nota2);
        AlunoDTO aluno = new AlunoDTO("nathan", subjectList);
        analiseAlunoDTO analise = new analiseAlunoDTO(9.5, aluno);
        assertEquals(alunoService.imprimeAnaliseDiploma(aluno), analise);
    }

    @Test
    void shouldBeHonors() {
        AlunoService alunoService = new AlunoService();
        Subject nota1 = new Subject("materia1", 9.0);
        Subject nota2 = new Subject("materia2", 9.0);
        List<Subject> subjectList = Arrays.asList(nota1, nota2);
        AlunoDTO aluno = new AlunoDTO("nathan", subjectList);
        assertEquals(alunoService.honors(10.0), true);
    }

    @Test
    void averageShouldBe9() {
        AlunoService alunoService = new AlunoService();
        Subject nota1 = new Subject("materia1", 9.0);
        Subject nota2 = new Subject("materia2", 9.0);
        List<Subject> subjectList = Arrays.asList(nota1, nota2);
        AlunoDTO aluno = new AlunoDTO("nathan", subjectList);
        assertEquals(alunoService.calculaMedia(aluno), 9.0);
    }
}
