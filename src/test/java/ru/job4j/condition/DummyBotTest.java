package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "������, ���.";
        String result = DummyBot.answer(in);
        String expected = "������, �����.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "����";
        String result = DummyBot.answer(in);
        String expected = "�� ������ �������.";
        Assert.assertEquals(expected, result);
    }
}