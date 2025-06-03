import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Consulta {

public Consulta (String ruta){
try {
    String urlUsuario = "https://semaforo-706f7-default-rtdb.firebaseio.com/.json";
        URL url = new URL(urlUsuario);

HttpURLConnection con = (HttpURLConnection) url.openConnection();

con.setRequestMethod("GET");
BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

StringBuilder content = new StringBuilder();
String inputLine;                                        //esta es una variable

while ((inputLine = in.readLine()) != null) {
    content.append(inputLine);
}
in.close();                                    //Cerrando la conexión
con.disconnect();                              //Cerrando el proceso
System.out.println(content.toString());        //Enviando el contenido
    } catch (Exception e) {
        System.out.println("error: "+ e);
    }
}
}
