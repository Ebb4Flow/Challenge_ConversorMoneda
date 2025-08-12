package ListadoPaises;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class LectorListado {
    private static final String Rutero = "src/Listado.json";
    private static List<Paises> paises;

    static {
        try (FileReader reader = new FileReader(Rutero)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Paises>>() {}.getType();
            paises = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            paises = List.of();
        }
    }
    public static void mostrarTabla() {
        System.out.printf("%-10s %-40s %-30s%n", "Código", "Pais", "Moneda");
        System.out.println("---------------------------------------------------------------");
        for (Paises p : paises) {
            System.out.printf("%-10s %-40s %-30s%n", p.getCodigo(), p.getPais(), p.getNombre_Moneda());
        }
    }
}
