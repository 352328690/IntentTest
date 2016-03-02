package com.example.intenttest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by lenovo on 2016/3/2.
 */
public class Person2 implements Parcelable {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    int age;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    public static final Parcelable.Creator<Person2>CREATOR = new Parcelable.Creator<Person2>(){
        @Override
        public Person2 createFromParcel(Parcel source) {
            Person2 person2 = new Person2();
            person2.name = source.readString();
            person2.age = source.readInt();
            return person2;
        }

        @Override
        public Person2[] newArray(int size) {
            return new Person2[size];
        }
    };
}
