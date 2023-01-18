package testrunner.internal;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import testrunner.model.StepDefinition;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadData {

    public static List<StepDefinition> readDataFromJson() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("step_definitions.json"));
            List<StepDefinition> steps = new Gson().fromJson(reader, new TypeToken<List<StepDefinition>>() {}.getType());
            reader.close();
            return steps;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
