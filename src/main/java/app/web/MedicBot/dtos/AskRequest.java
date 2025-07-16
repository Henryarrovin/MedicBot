package app.web.MedicBot.dtos;

import java.util.List;
import java.util.Map;

public record AskRequest(
        String chatId,
        String question,
        Integer age,
        String gender,
        List<String> symptoms,
        List<String> conditions,
        Map<String, String> vitals
) {
}
