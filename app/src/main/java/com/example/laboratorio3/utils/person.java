package com.example.laboratorio3.utils;

import android.os.Parcel;
import android.os.Parcelable;

public class person implements Parcelable {
    private static   String username,password,email,gender;

    public person(String username, String password ,String email,String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;

    }

    public static void setUsername(String username) {
        person.username = username;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        person.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        person.email = email;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        person.gender = gender;
    }

    public static Creator<person> getCREATOR() {
        return CREATOR;
    }

    public person(Parcel in) {
        username = in.readString();
        password = in.readString();
        email = in.readString();
        gender = in.readString();
    }


    public person (){

    }



    public static final Creator<person> CREATOR = new Creator<person>() {
        @Override
        public person createFromParcel(Parcel in) {
            return new person(in);
        }

        @Override
        public person[] newArray(int size) {
            return new person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
        dest.writeString(email);
        dest.writeString(gender);
    }
}
