package com.example.lib;

public class aa {

    private RichClubInfo richClubInfo;

    public RichClubInfo getRichClubInfo() {
        return richClubInfo;
    }

    public void setRichClubInfo(RichClubInfo richClubInfo) {
        this.richClubInfo = richClubInfo;
    }

    public static class RichClubInfo {
        private String richClubId;
        private String name;
        private boolean chuanyinEnable;

        public String getRichClubId() {
            return richClubId;
        }

        public void setRichClubId(String richClubId) {
            this.richClubId = richClubId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isChuanyinEnable() {
            return chuanyinEnable;
        }

        public void setChuanyinEnable(boolean chuanyinEnable) {
            this.chuanyinEnable = chuanyinEnable;
        }
    }
}
