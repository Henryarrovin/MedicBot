package app.web.MedicBot.dtos;

import java.util.List;

public record AskResponse(
        String answer,
        List<String> sources
) {
}
