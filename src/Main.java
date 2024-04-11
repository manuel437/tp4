import com.app.controllador.ProfesorController;
import com.app.model.entity.Profesor;

public class Main {
    public static void main(String[] args) {
        ProfesorController pro = new ProfesorController();
        pro.cargarProfesor(new Profesor("pepe","perez",25,"mates","678"));
        pro.cargarProfesor(new Profesor("pjose","perez",25,"mates","538"));
        pro.cargarProfesor(new Profesor("palope","perez",25,"mates","458"));
        pro.printListProfesor();

    }
}