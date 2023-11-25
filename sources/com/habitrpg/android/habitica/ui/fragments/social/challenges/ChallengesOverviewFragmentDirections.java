package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.os.Bundle;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ChallengesOverviewFragmentDirections {

    /* loaded from: classes4.dex */
    public static class OpenChallengeDetail implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenChallengeDetail openChallengeDetail = (OpenChallengeDetail) obj;
            if (this.arguments.containsKey("challengeID") != openChallengeDetail.arguments.containsKey("challengeID")) {
                return false;
            }
            if (getChallengeID() == null ? openChallengeDetail.getChallengeID() != null : !getChallengeID().equals(openChallengeDetail.getChallengeID())) {
                return false;
            }
            if (getActionId() == openChallengeDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openChallengeDetail;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("challengeID")) {
                bundle.putString("challengeID", (String) this.arguments.get("challengeID"));
            }
            return bundle;
        }

        public String getChallengeID() {
            return (String) this.arguments.get("challengeID");
        }

        public int hashCode() {
            int i10;
            if (getChallengeID() != null) {
                i10 = getChallengeID().hashCode();
            } else {
                i10 = 0;
            }
            return ((i10 + 31) * 31) + getActionId();
        }

        public OpenChallengeDetail setChallengeID(String str) {
            if (str != null) {
                this.arguments.put("challengeID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"challengeID\" is marked as non-null but was passed a null value.");
        }

        public String toString() {
            return "OpenChallengeDetail(actionId=" + getActionId() + "){challengeID=" + getChallengeID() + "}";
        }

        private OpenChallengeDetail(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("challengeID", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"challengeID\" is marked as non-null but was passed a null value.");
        }
    }

    private ChallengesOverviewFragmentDirections() {
    }

    public static MainNavDirections.ActionGlobalClassSelectionActivity actionGlobalClassSelectionActivity() {
        return MainNavDirections.actionGlobalClassSelectionActivity();
    }

    public static MainNavDirections.ActionGlobalReportMessageActivity actionGlobalReportMessageActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.actionGlobalReportMessageActivity(str, str2, str3, str4);
    }

    public static MainNavDirections.OpenArmoireActivity openArmoireActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.openArmoireActivity(str, str2, str3, str4);
    }

    public static OpenChallengeDetail openChallengeDetail(String str) {
        return new OpenChallengeDetail(str);
    }

    public static MainNavDirections.OpenProfileActivity openProfileActivity(String str) {
        return MainNavDirections.openProfileActivity(str);
    }
}
