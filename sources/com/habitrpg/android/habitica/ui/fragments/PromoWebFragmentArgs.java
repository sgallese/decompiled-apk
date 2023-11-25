package com.habitrpg.android.habitica.ui.fragments;

import android.os.Bundle;
import androidx.lifecycle.n0;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class PromoWebFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static PromoWebFragmentArgs fromBundle(Bundle bundle) {
        PromoWebFragmentArgs promoWebFragmentArgs = new PromoWebFragmentArgs();
        bundle.setClassLoader(PromoWebFragmentArgs.class.getClassLoader());
        if (bundle.containsKey(ImagesContract.URL)) {
            String string = bundle.getString(ImagesContract.URL);
            if (string != null) {
                promoWebFragmentArgs.arguments.put(ImagesContract.URL, string);
                return promoWebFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
    }

    public static PromoWebFragmentArgs fromSavedStateHandle(n0 n0Var) {
        PromoWebFragmentArgs promoWebFragmentArgs = new PromoWebFragmentArgs();
        if (n0Var.e(ImagesContract.URL)) {
            String str = (String) n0Var.f(ImagesContract.URL);
            if (str != null) {
                promoWebFragmentArgs.arguments.put(ImagesContract.URL, str);
                return promoWebFragmentArgs;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromoWebFragmentArgs promoWebFragmentArgs = (PromoWebFragmentArgs) obj;
        if (this.arguments.containsKey(ImagesContract.URL) != promoWebFragmentArgs.arguments.containsKey(ImagesContract.URL)) {
            return false;
        }
        if (getUrl() == null ? promoWebFragmentArgs.getUrl() == null : getUrl().equals(promoWebFragmentArgs.getUrl())) {
            return true;
        }
        return false;
    }

    public String getUrl() {
        return (String) this.arguments.get(ImagesContract.URL);
    }

    public int hashCode() {
        int i10;
        if (getUrl() != null) {
            i10 = getUrl().hashCode();
        } else {
            i10 = 0;
        }
        return 31 + i10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey(ImagesContract.URL)) {
            bundle.putString(ImagesContract.URL, (String) this.arguments.get(ImagesContract.URL));
        }
        return bundle;
    }

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey(ImagesContract.URL)) {
            n0Var.j(ImagesContract.URL, (String) this.arguments.get(ImagesContract.URL));
        }
        return n0Var;
    }

    public String toString() {
        return "PromoWebFragmentArgs{url=" + getUrl() + "}";
    }

    private PromoWebFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(PromoWebFragmentArgs promoWebFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(promoWebFragmentArgs.arguments);
        }

        public PromoWebFragmentArgs build() {
            return new PromoWebFragmentArgs(this.arguments);
        }

        public String getUrl() {
            return (String) this.arguments.get(ImagesContract.URL);
        }

        public Builder setUrl(String str) {
            if (str != null) {
                this.arguments.put(ImagesContract.URL, str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }

        public Builder(String str) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put(ImagesContract.URL, str);
                return;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
    }

    private PromoWebFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
