package com.company.Summative1DildyJustin.Models;

import java.util.Objects;

public class Answer {
    int id;
    String question;
    String answer;


    public Answer() { };
    public Answer(String answer, String question, int id) {
    this.answer = answer;
    this.question = question;
    this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;
        Answer answer1 = (Answer) o;
        return id == answer1.id && question.equals(answer1.question) && answer.equals(answer1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }
}
