package com.company;

import com.company.model.SaveFileDto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("saveFile.json");

        SaveFileDto saveFileDto = new SaveFileDto(2.4f,5.3f);

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(saveFileDto);

        System.out.println(json);

        fileWriter.write(json);

        fileWriter.close();

        File file = new File("saveFile.json");
        SaveFileDto readSFD = objectMapper.readValue(file, SaveFileDto.class);

        System.out.println(readSFD.toString());
    }
}
