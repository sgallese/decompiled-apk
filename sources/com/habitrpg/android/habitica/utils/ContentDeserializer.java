package com.habitrpg.android.habitica.utils;

import com.google.firebase.perf.metrics.Trace;
import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.ContentGear;
import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.FAQArticle;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import qc.q;
import s9.e;

/* compiled from: ContentDeserializer.kt */
/* loaded from: classes4.dex */
public final class ContentDeserializer implements k<ContentResult> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
    @Override // com.google.gson.k
    public ContentResult deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        Trace e10 = e.c().e("ContentDeserialize");
        q.h(e10, "newTrace(...)");
        e10.start();
        ContentResult contentResult = new ContentResult();
        n i10 = lVar.i();
        contentResult.setPotion((Equipment) jVar.a(i10.x("potion"), Equipment.class));
        contentResult.setArmoire((Equipment) jVar.a(i10.x("armoire"), Equipment.class));
        contentResult.setGear((ContentGear) jVar.a(i10.x("gear"), ContentGear.class));
        Iterator<Map.Entry<String, l>> it = i10.x("quests").i().w().iterator();
        while (it.hasNext()) {
            contentResult.getQuests().add(jVar.a(it.next().getValue(), QuestContent.class));
            for (QuestContent questContent : contentResult.getQuests()) {
                questContent.setKey(questContent.getKey());
            }
        }
        Iterator<Map.Entry<String, l>> it2 = i10.x("eggs").i().w().iterator();
        while (it2.hasNext()) {
            contentResult.getEggs().add(jVar.a(it2.next().getValue(), Egg.class));
        }
        Iterator<Map.Entry<String, l>> it3 = i10.x("food").i().w().iterator();
        while (it3.hasNext()) {
            contentResult.getFood().add(jVar.a(it3.next().getValue(), Food.class));
        }
        Iterator<Map.Entry<String, l>> it4 = i10.x("hatchingPotions").i().w().iterator();
        while (it4.hasNext()) {
            contentResult.getHatchingPotions().add(jVar.a(it4.next().getValue(), HatchingPotion.class));
        }
        n A = i10.A("petInfo");
        for (String str : A.E()) {
            Pet pet = new Pet();
            n A2 = A.A(str);
            pet.setAnimal(JsonObjectExtensionsKt.getAsString(A2, "egg"));
            pet.setColor(JsonObjectExtensionsKt.getAsString(A2, "potion"));
            pet.setKey(JsonObjectExtensionsKt.getAsString(A2, "key"));
            pet.setText(JsonObjectExtensionsKt.getAsString(A2, "text"));
            pet.setType(JsonObjectExtensionsKt.getAsString(A2, TaskFormActivity.TASK_TYPE_KEY));
            if (q.d(pet.getType(), "premium")) {
                pet.setPremium(true);
            }
            contentResult.getPets().add(pet);
        }
        n A3 = i10.A("mountInfo");
        for (String str2 : A3.E()) {
            Mount mount = new Mount();
            n A4 = A3.A(str2);
            mount.setAnimal(JsonObjectExtensionsKt.getAsString(A4, "egg"));
            mount.setColor(JsonObjectExtensionsKt.getAsString(A4, "potion"));
            mount.setKey(JsonObjectExtensionsKt.getAsString(A4, "key"));
            mount.setText(JsonObjectExtensionsKt.getAsString(A4, "text"));
            mount.setType(JsonObjectExtensionsKt.getAsString(A4, TaskFormActivity.TASK_TYPE_KEY));
            if (q.d(mount.getType(), "premium")) {
                mount.setPremium(true);
            }
            contentResult.getMounts().add(mount);
        }
        for (Map.Entry<String, l> entry : i10.A("spells").w()) {
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
                contentResult.getSpells().add(skill);
            }
        }
        if (i10.D("special")) {
            Iterator<Map.Entry<String, l>> it5 = i10.x("special").i().w().iterator();
            while (it5.hasNext()) {
                contentResult.getSpecial().add(jVar.a(it5.next().getValue(), SpecialItem.class));
            }
        }
        Object a10 = jVar.a(i10.x("appearances"), new TypeToken<x0<Customization>>() { // from class: com.habitrpg.android.habitica.utils.ContentDeserializer$deserialize$2
        }.getType());
        q.h(a10, "deserialize(...)");
        contentResult.setAppearances((x0) a10);
        Object a11 = jVar.a(i10.x("backgrounds"), new TypeToken<x0<Customization>>() { // from class: com.habitrpg.android.habitica.utils.ContentDeserializer$deserialize$3
        }.getType());
        q.h(a11, "deserialize(...)");
        contentResult.setBackgrounds((x0) a11);
        Customization customization = new Customization();
        customization.setCustomizationSet("incentiveBackgrounds");
        customization.setCustomizationSetName("Login Incentive");
        customization.setIdentifier("");
        customization.setPrice(0);
        customization.setType("background");
        contentResult.getBackgrounds().add(customization);
        Object a12 = jVar.a(i10.x("faq"), new TypeToken<x0<FAQArticle>>() { // from class: com.habitrpg.android.habitica.utils.ContentDeserializer$deserialize$4
        }.getType());
        q.h(a12, "deserialize(...)");
        contentResult.setFaq((x0) a12);
        e10.stop();
        return contentResult;
    }
}
