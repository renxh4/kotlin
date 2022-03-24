package com.example.lib;

import java.util.List;

public class aaa {


    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private List<ListsDTO> lists;

        public List<ListsDTO> getLists() {
            return lists;
        }

        public void setLists(List<ListsDTO> lists) {
            this.lists = lists;
        }

        public static class ListsDTO {
            private String richClubId;
            private String momoid;
            private String name;
            private String avatar;
            private String sex;
            private int age;
            private List<MedalsDTO> medals;

            public String getRichClubId() {
                return richClubId;
            }

            public void setRichClubId(String richClubId) {
                this.richClubId = richClubId;
            }

            public String getMomoid() {
                return momoid;
            }

            public void setMomoid(String momoid) {
                this.momoid = momoid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public List<MedalsDTO> getMedals() {
                return medals;
            }

            public void setMedals(List<MedalsDTO> medals) {
                this.medals = medals;
            }

            public static class MedalsDTO {
                private String imgId;
                private int width;
                private int height;

                public String getImgId() {
                    return imgId;
                }

                public void setImgId(String imgId) {
                    this.imgId = imgId;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }
        }
    }
}
