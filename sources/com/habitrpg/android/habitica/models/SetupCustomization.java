package com.habitrpg.android.habitica.models;

import qc.h;
import qc.q;

/* compiled from: SetupCustomization.kt */
/* loaded from: classes4.dex */
public final class SetupCustomization {
    private Integer colorId;
    private Integer drawableId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private String key = "";
    private String text = "";
    private String path = "";
    private String category = "";
    private String subcategory = "";

    /* compiled from: SetupCustomization.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final SetupCustomization createFlower(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(num);
            setupCustomization.setPath("hair.flower");
            setupCustomization.setCategory("extras");
            setupCustomization.setSubcategory("flower");
            return setupCustomization;
        }

        public final SetupCustomization createGlasses(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(num);
            setupCustomization.setPath("glasses");
            setupCustomization.setCategory("extras");
            setupCustomization.setSubcategory("glasses");
            return setupCustomization;
        }

        public final SetupCustomization createHairBangs(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(num);
            setupCustomization.setPath("hair.bangs");
            setupCustomization.setCategory("hair");
            setupCustomization.setSubcategory("bangs");
            return setupCustomization;
        }

        public final SetupCustomization createHairColor(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setColorId(num);
            setupCustomization.setPath("hair.color");
            setupCustomization.setCategory("hair");
            setupCustomization.setSubcategory("color");
            return setupCustomization;
        }

        public final SetupCustomization createHairPonytail(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(num);
            setupCustomization.setPath("hair.base");
            setupCustomization.setCategory("hair");
            setupCustomization.setSubcategory("base");
            return setupCustomization;
        }

        public final SetupCustomization createShirt(String str, int i10) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(Integer.valueOf(i10));
            setupCustomization.setPath("shirt");
            setupCustomization.setCategory("body");
            setupCustomization.setSubcategory("shirt");
            return setupCustomization;
        }

        public final SetupCustomization createSize(String str, int i10, String str2) {
            q.i(str, "key");
            q.i(str2, "text");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(Integer.valueOf(i10));
            setupCustomization.setText(str2);
            setupCustomization.setPath("size");
            setupCustomization.setCategory("body");
            setupCustomization.setSubcategory("size");
            return setupCustomization;
        }

        public final SetupCustomization createSkin(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setColorId(num);
            setupCustomization.setPath("skin");
            setupCustomization.setCategory("skin");
            return setupCustomization;
        }

        public final SetupCustomization createWheelchair(String str, Integer num) {
            q.i(str, "key");
            SetupCustomization setupCustomization = new SetupCustomization();
            setupCustomization.setKey(str);
            setupCustomization.setDrawableId(num);
            setupCustomization.setPath("chair");
            setupCustomization.setCategory("extras");
            setupCustomization.setSubcategory("wheelchair");
            return setupCustomization;
        }
    }

    public final String getCategory() {
        return this.category;
    }

    public final Integer getColorId() {
        return this.colorId;
    }

    public final Integer getDrawableId() {
        return this.drawableId;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSubcategory() {
        return this.subcategory;
    }

    public final String getText() {
        return this.text;
    }

    public final void setCategory(String str) {
        q.i(str, "<set-?>");
        this.category = str;
    }

    public final void setColorId(Integer num) {
        this.colorId = num;
    }

    public final void setDrawableId(Integer num) {
        this.drawableId = num;
    }

    public final void setKey(String str) {
        q.i(str, "<set-?>");
        this.key = str;
    }

    public final void setPath(String str) {
        q.i(str, "<set-?>");
        this.path = str;
    }

    public final void setSubcategory(String str) {
        q.i(str, "<set-?>");
        this.subcategory = str;
    }

    public final void setText(String str) {
        q.i(str, "<set-?>");
        this.text = str;
    }
}
