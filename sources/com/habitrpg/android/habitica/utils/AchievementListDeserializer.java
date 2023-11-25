package com.habitrpg.android.habitica.utils;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import ec.u0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AchievementListDeserializer.kt */
/* loaded from: classes4.dex */
public final class AchievementListDeserializer implements k<List<? extends Achievement>> {
    public static final int $stable = 0;

    @Override // com.google.gson.k
    public List<? extends Achievement> deserialize(l lVar, Type type, j jVar) {
        Set<Map.Entry<String, l>> b10;
        n i10;
        ArrayList arrayList = new ArrayList();
        if (lVar == null || (i10 = lVar.i()) == null || (b10 = i10.w()) == null) {
            b10 = u0.b();
        }
        for (Map.Entry<String, l> entry : b10) {
            String key = entry.getKey();
            for (Map.Entry<String, l> entry2 : entry.getValue().i().A(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS).w()) {
                n i11 = entry2.getValue().i();
                Achievement achievement = new Achievement();
                achievement.setKey(entry2.getKey());
                achievement.setCategory(key);
                achievement.setEarned(i11.x("earned").a());
                achievement.setTitle(JsonObjectExtensionsKt.getAsString(i11, "title"));
                achievement.setText(JsonObjectExtensionsKt.getAsString(i11, "text"));
                achievement.setIcon(JsonObjectExtensionsKt.getAsString(i11, "icon"));
                achievement.setIndex(i11.D("index") ? i11.x("index").g() : 0);
                achievement.setOptionalCount(i11.D("optionalCount") ? Integer.valueOf(i11.x("optionalCount").g()) : 0);
                arrayList.add(achievement);
            }
        }
        return arrayList;
    }
}
