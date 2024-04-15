package com.example.mitrofanovaviktoria.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String firstName = "first name";
    public String secondName = "second name";

    public String detailsInformation = "default information";
    public String age = "0";
}
