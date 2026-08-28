import java.util.Scanner;
public class VotosPractica {

public static void main(String[] args) {
Scanner leer = new Scanner (System.in);

int servicio1 = 0;
int servicio2 = 0;
int servicio3 = 0;
int terminarEncuesta4 = 0;
int votos = 0;
boolean continuar = true;
double porcentajeVoto = 0.0;

while (continuar) {
   System.out.println("SELECCIONE UNA OPCION");
   System.out.println("Servicio 1 EXCELENTE");
   System.out.println("Servicio 2  REGULAR");
   System.out.println("Servicio 3 MALO");
   System.out.println("Finalizar Encuesta 4");
   int opcion = Scanner.nextint();
};
switch (opcion) {
    case 1:
        servicio1 ++;
        break;
        case 2:
            servicio2 ++;
            break;
            case 3:
                servicio3 ++;
                break;
                case 4:
                    continuar = false;
                    break;

           default:
            System.out.println("Opcion Incorrecta Intente De Nuevo");
           break;
           votos = servicios1 + servicio2 + servicio3;
           if(votos = 0)
            double porcentajeVoto = ((double)servicio1 / votos)*100;
           if (porcentajeVoto>=70.0);{
            System.out.println("Meta De Saticcion Alcanzada");
            }
            else
                System.out.println("No Se Registraron Los Votos");

            close.leer();

           

           }
}