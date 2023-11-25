package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import qc.q;

/* compiled from: SkillDeserializer.kt */
/* loaded from: classes4.dex */
public final class SkillDeserializer implements k<List<? extends Skill>> {
    public static final int $stable = 0;

    @Override // com.google.gson.k
    public List<? extends Skill> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, TaskFormActivity.TASK_TYPE_KEY);
        q.i(jVar, "context");
        n i10 = lVar.i();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, l> entry : i10.w()) {
            q.f(entry);
            String key = entry.getKey();
            for (Map.Entry<String, l> entry2 : entry.getValue().i().w()) {
                q.f(entry2);
                n i11 = entry2.getValue().i();
                Skill skill = new Skill();
                String l10 = i11.x("key").l();
                q.h(l10, "getAsString(...)");
                skill.setKey(l10);
                String l11 = i11.x("text").l();
                q.h(l11, "getAsString(...)");
                skill.setText(l11);
                skill.setNotes(i11.x("notes").l());
                String l12 = i11.x("key").l();
                q.h(l12, "getAsString(...)");
                skill.setKey(l12);
                skill.setTarget(i11.x("target").l());
                skill.setHabitClass(key);
                skill.setMana(Integer.valueOf(i11.x("mana").g()));
                l x10 = i11.x("lvl");
                if (x10 != null) {
                    skill.setLvl(Integer.valueOf(x10.g()));
                }
                arrayList.add(skill);
            }
        }
        return arrayList;
    }
}
