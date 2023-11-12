package src.use_case.game;

import com.theokanning.openai.completion.chat.ChatCompletionChoice;

import java.util.List;

public interface GameDataAccessInterface {

    void addSystemPrompt(String prompt);

    void addUserPrompt(String prompt);

    List<ChatCompletionChoice> runChatGPT();

    void clearMessages();

}