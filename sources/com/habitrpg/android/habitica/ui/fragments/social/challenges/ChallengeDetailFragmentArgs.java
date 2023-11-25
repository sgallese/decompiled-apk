package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ChallengeDetailFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static ChallengeDetailFragmentArgs fromBundle(Bundle bundle) {
        ChallengeDetailFragmentArgs challengeDetailFragmentArgs = new ChallengeDetailFragmentArgs();
        bundle.setClassLoader(ChallengeDetailFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("challengeID")) {
            String string = bundle.getString("challengeID");
            if (string != null) {
                challengeDetailFragmentArgs.arguments.put("challengeID", string);
                return challengeDetailFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"challengeID\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"challengeID\" is missing and does not have an android:defaultValue");
    }

    public static ChallengeDetailFragmentArgs fromSavedStateHandle(n0 n0Var) {
        ChallengeDetailFragmentArgs challengeDetailFragmentArgs = new ChallengeDetailFragmentArgs();
        if (n0Var.e("challengeID")) {
            String str = (String) n0Var.f("challengeID");
            if (str != null) {
                challengeDetailFragmentArgs.arguments.put("challengeID", str);
                return challengeDetailFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"challengeID\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"challengeID\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChallengeDetailFragmentArgs challengeDetailFragmentArgs = (ChallengeDetailFragmentArgs) obj;
        if (this.arguments.containsKey("challengeID") != challengeDetailFragmentArgs.arguments.containsKey("challengeID")) {
            return false;
        }
        if (getChallengeID() == null ? challengeDetailFragmentArgs.getChallengeID() == null : getChallengeID().equals(challengeDetailFragmentArgs.getChallengeID())) {
            return true;
        }
        return false;
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
        return 31 + i10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("challengeID")) {
            bundle.putString("challengeID", (String) this.arguments.get("challengeID"));
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("challengeID")) {
            n0Var.j("challengeID", (String) this.arguments.get("challengeID"));
        }
        return n0Var;
    }

    public String toString() {
        return "ChallengeDetailFragmentArgs{challengeID=" + getChallengeID() + "}";
    }

    private ChallengeDetailFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(ChallengeDetailFragmentArgs challengeDetailFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(challengeDetailFragmentArgs.arguments);
        }

        public ChallengeDetailFragmentArgs build() {
            return new ChallengeDetailFragmentArgs(this.arguments);
        }

        public String getChallengeID() {
            return (String) this.arguments.get("challengeID");
        }

        public Builder setChallengeID(String str) {
            if (str != null) {
                this.arguments.put("challengeID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"challengeID\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("challengeID", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"challengeID\" is marked as non-null but was passed a null value.");
        }
    }

    private ChallengeDetailFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
