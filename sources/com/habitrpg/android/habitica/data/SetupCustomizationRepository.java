package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.SetupCustomization;
import com.habitrpg.android.habitica.models.user.User;
import java.util.List;

/* compiled from: SetupCustomizationRepository.kt */
/* loaded from: classes4.dex */
public interface SetupCustomizationRepository {
    public static final String CATEGORY_BODY = "body";
    public static final String CATEGORY_EXTRAS = "extras";
    public static final String CATEGORY_HAIR = "hair";
    public static final String CATEGORY_SKIN = "skin";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String SUBCATEGORY_BANGS = "bangs";
    public static final String SUBCATEGORY_COLOR = "color";
    public static final String SUBCATEGORY_FLOWER = "flower";
    public static final String SUBCATEGORY_GLASSES = "glasses";
    public static final String SUBCATEGORY_PONYTAIL = "ponytail";
    public static final String SUBCATEGORY_SHIRT = "shirt";
    public static final String SUBCATEGORY_SIZE = "size";
    public static final String SUBCATEGORY_WHEELCHAIR = "wheelchair";

    /* compiled from: SetupCustomizationRepository.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CATEGORY_BODY = "body";
        public static final String CATEGORY_EXTRAS = "extras";
        public static final String CATEGORY_HAIR = "hair";
        public static final String CATEGORY_SKIN = "skin";
        public static final String SUBCATEGORY_BANGS = "bangs";
        public static final String SUBCATEGORY_COLOR = "color";
        public static final String SUBCATEGORY_FLOWER = "flower";
        public static final String SUBCATEGORY_GLASSES = "glasses";
        public static final String SUBCATEGORY_PONYTAIL = "ponytail";
        public static final String SUBCATEGORY_SHIRT = "shirt";
        public static final String SUBCATEGORY_SIZE = "size";
        public static final String SUBCATEGORY_WHEELCHAIR = "wheelchair";

        private Companion() {
        }
    }

    List<SetupCustomization> getCustomizations(String str, User user);

    List<SetupCustomization> getCustomizations(String str, String str2, User user);
}
