package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.habitrpg.android.habitica.models.TutorialStep;
import ec.t;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import qc.q;

/* compiled from: TutorialStepListDeserializer.kt */
/* loaded from: classes4.dex */
public final class TutorialStepListDeserializer implements k<List<? extends TutorialStep>> {
    public static final int $stable = 0;

    private final TutorialStep parseStep(String str, Map.Entry<String, l> entry) {
        TutorialStep tutorialStep = new TutorialStep();
        tutorialStep.setTutorialGroup(str);
        tutorialStep.setIdentifier(entry.getKey());
        tutorialStep.setWasCompleted(entry.getValue().a());
        return tutorialStep;
    }

    @Override // com.google.gson.k
    public List<? extends TutorialStep> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        List<String> l10;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        x0 x0Var = new x0();
        l10 = t.l("common", "android");
        for (String str : l10) {
            if (lVar.i().D(str)) {
                for (Map.Entry<String, l> entry : lVar.i().x(str).i().w()) {
                    q.f(entry);
                    x0Var.add(parseStep(str, entry));
                }
            }
        }
        return x0Var;
    }
}
