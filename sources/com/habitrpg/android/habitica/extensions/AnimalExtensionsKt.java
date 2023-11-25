package com.habitrpg.android.habitica.extensions;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.inventory.Animal;
import qc.q;

/* compiled from: AnimalExtensions.kt */
/* loaded from: classes4.dex */
public final class AnimalExtensionsKt {
    public static final String getTranslatedAnimalType(Context context, String str) {
        if (context == null) {
            return str;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2008465223:
                    if (str.equals("special")) {
                        return context.getString(R.string.special);
                    }
                    return str;
                case -318452137:
                    if (str.equals("premium")) {
                        return context.getString(R.string.magic_potion);
                    }
                    return str;
                case 3092207:
                    if (str.equals("drop")) {
                        return context.getString(R.string.standard);
                    }
                    return str;
                case 107944162:
                    if (str.equals("quest")) {
                        return context.getString(R.string.quest);
                    }
                    return str;
                case 112887303:
                    if (str.equals("wacky")) {
                        return context.getString(R.string.wacky);
                    }
                    return str;
                default:
                    return str;
            }
        }
        return str;
    }

    public static final String getTranslatedType(Animal animal, Context context) {
        q.i(animal, "<this>");
        return getTranslatedAnimalType(context, animal.getType());
    }
}
