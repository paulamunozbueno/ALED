public class Semana6 {

    static class Paciente {
        String nombre;
        int pulso;

        public Paciente(String nombre, int pulso) {
            this.nombre = nombre;
            this.pulso = pulso;
        }

        public boolean pulsoNormal() {
            return pulso >= 60 && pulso <= 100;
        }
    }

    public static void main(String[] args) {

        Paciente[] pacientes = {
            new Paciente("Paciente 1", 72),
            new Paciente("Paciente 2", 110),
            new Paciente("Paciente 3", 85)
        };

        for (Paciente p : pacientes) {
            System.out.println(p.nombre + ": " + p.pulso + " lpm -> normal: " + p.pulsoNormal());
        }
    }
}  
