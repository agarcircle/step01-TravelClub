package io.namoosori.java.travelClub;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.util.DateUtil;

public class StoryAssistant {
    public static void main(String[] args) {
        System.out.println(DateUtil.today());
        TravelClub newClub = new TravelClub("Jeju Club", "Jeju TravelClub");
        System.out.println(newClub.toString());

        System.out.println(TravelClub.getSample().toString());
    }
}
