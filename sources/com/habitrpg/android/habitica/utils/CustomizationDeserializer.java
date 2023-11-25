package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import ec.b0;
import ec.t;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import qc.q;

/* compiled from: CustomizationDeserializer.kt */
/* loaded from: classes4.dex */
public final class CustomizationDeserializer implements k<List<? extends Customization>> {
    public static final int $stable = 8;
    private final SimpleDateFormat formatter = new SimpleDateFormat("MMMM");
    private final Calendar calendar = Calendar.getInstance();

    private final String getMonthName(int i10) {
        this.calendar.set(2, i10);
        String format = this.formatter.format(this.calendar.getTime());
        q.h(format, "format(...)");
        String upperCase = format.toUpperCase(Locale.ROOT);
        q.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    private final Customization parseBackground(Customization customization, String str, int i10, String str2, n nVar) {
        if (customization == null) {
            customization = new Customization();
            customization.setCustomizationSet(str);
            customization.setType("background");
            customization.setIdentifier(str2);
        }
        int hashCode = str.hashCode();
        if (hashCode != 123283006) {
            if (hashCode != 1064196762) {
                if (hashCode == 1154990603 && str.equals("eventBackgrounds")) {
                    customization.setCustomizationSetName("EVENT BACKGROUNDS");
                    customization.setPrice(0);
                    customization.setSetPrice(0);
                    customization.setBuyable(false);
                }
                String substring = str.substring(11, 13);
                q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String monthName = getMonthName(Integer.parseInt(substring) - 1);
                String substring2 = str.substring(13, 17);
                q.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                customization.setCustomizationSetName("SET " + (i10 + 1) + ": " + monthName + " " + substring2);
                String substring3 = str.substring(13, 17);
                q.h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring4 = str.substring(11, 13);
                q.h(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                customization.setCustomizationSet(substring3 + "." + substring4);
                customization.setPrice(7);
                customization.setSetPrice(15);
            } else {
                if (str.equals("incentiveBackgrounds")) {
                    customization.setCustomizationSetName("PLAIN BACKGROUND SET");
                    customization.setPrice(0);
                    customization.setSetPrice(0);
                    customization.setBuyable(false);
                }
                String substring5 = str.substring(11, 13);
                q.h(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                String monthName2 = getMonthName(Integer.parseInt(substring5) - 1);
                String substring22 = str.substring(13, 17);
                q.h(substring22, "this as java.lang.String…ing(startIndex, endIndex)");
                customization.setCustomizationSetName("SET " + (i10 + 1) + ": " + monthName2 + " " + substring22);
                String substring32 = str.substring(13, 17);
                q.h(substring32, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring42 = str.substring(11, 13);
                q.h(substring42, "this as java.lang.String…ing(startIndex, endIndex)");
                customization.setCustomizationSet(substring32 + "." + substring42);
                customization.setPrice(7);
                customization.setSetPrice(15);
            }
        } else {
            if (str.equals("timeTravelBackgrounds")) {
                customization.setCustomizationSetName("STEAMPUNK BACKGROUNDS");
                customization.setPrice(1);
                customization.setSetPrice(0);
                customization.setBuyable(false);
            }
            String substring52 = str.substring(11, 13);
            q.h(substring52, "this as java.lang.String…ing(startIndex, endIndex)");
            String monthName22 = getMonthName(Integer.parseInt(substring52) - 1);
            String substring222 = str.substring(13, 17);
            q.h(substring222, "this as java.lang.String…ing(startIndex, endIndex)");
            customization.setCustomizationSetName("SET " + (i10 + 1) + ": " + monthName22 + " " + substring222);
            String substring322 = str.substring(13, 17);
            q.h(substring322, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring422 = str.substring(11, 13);
            q.h(substring422, "this as java.lang.String…ing(startIndex, endIndex)");
            customization.setCustomizationSet(substring322 + "." + substring422);
            customization.setPrice(7);
            customization.setSetPrice(15);
        }
        customization.setText(nVar.x("text").l());
        customization.setNotes(nVar.i().x("notes").l());
        return customization;
    }

    private final Customization parseCustomization(Customization customization, String str, String str2, String str3, n nVar) {
        if (customization == null) {
            customization = new Customization();
            customization.setIdentifier(str3);
            customization.setType(str);
            if (str2 != null) {
                customization.setCategory(str2);
            }
        }
        if (nVar.D("price")) {
            customization.setPrice(Integer.valueOf(nVar.x("price").g()));
        }
        if (nVar.D("set")) {
            n i10 = nVar.x("set").i();
            customization.setCustomizationSet(i10.x("key").l());
            if (i10.D("setPrice")) {
                customization.setSetPrice(Integer.valueOf(i10.x("setPrice").g()));
            }
            if (i10.D("text")) {
                customization.setCustomizationSetName(i10.x("text").l());
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                if (i10.D("availableFrom")) {
                    customization.setAvailableFrom(simpleDateFormat.parse(i10.x("availableFrom").l()));
                }
                if (i10.D("availableUntil")) {
                    customization.setAvailableUntil(simpleDateFormat.parse(i10.x("availableUntil").l()));
                }
            } catch (Exception e10) {
                ExceptionHandler.Companion.reportError(e10);
            }
        }
        return customization;
    }

    @Override // com.google.gson.k
    public List<? extends Customization> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        List C0;
        List<String> l10;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        n i10 = lVar.i();
        x0 x0Var = new x0();
        o0 Z0 = o0.Z0();
        List<Customization> z02 = Z0.z0(Z0.k1(Customization.class).p());
        if (i10.D("shirt")) {
            for (Customization customization : z02) {
                if (i10.D(customization.getType())) {
                    n i11 = i10.x(customization.getType()).i();
                    if (customization.getCategory() != null) {
                        if (i11.D(customization.getCategory())) {
                            i11 = i11.x(customization.getCategory()).i();
                        }
                    }
                    n nVar = i11;
                    if (nVar.D(customization.getIdentifier())) {
                        String type2 = customization.getType();
                        String category = customization.getCategory();
                        String identifier = customization.getIdentifier();
                        n i12 = nVar.x(customization.getIdentifier()).i();
                        q.h(i12, "getAsJsonObject(...)");
                        x0Var.add(parseCustomization(customization, type2, category, identifier, i12));
                        nVar.F(customization.getIdentifier());
                    }
                }
            }
            l10 = t.l("shirt", "skin", "chair");
            for (String str : l10) {
                for (Map.Entry<String, l> entry : i10.x(str).i().w()) {
                    q.f(entry);
                    String key = entry.getKey();
                    n i13 = entry.getValue().i();
                    q.h(i13, "getAsJsonObject(...)");
                    x0Var.add(parseCustomization(null, str, null, key, i13));
                }
            }
            for (Map.Entry<String, l> entry2 : i10.x("hair").i().w()) {
                q.f(entry2);
                String key2 = entry2.getKey();
                for (Map.Entry<String, l> entry3 : entry2.getValue().i().w()) {
                    q.f(entry3);
                    String key3 = entry3.getKey();
                    n i14 = entry3.getValue().i();
                    q.h(i14, "getAsJsonObject(...)");
                    x0Var.add(parseCustomization(null, "hair", key2, key3, i14));
                }
            }
        } else {
            Set<String> E = i10.E();
            q.h(E, "keySet(...)");
            C0 = b0.C0(E);
            for (Customization customization2 : z02) {
                if (i10.D(customization2.getCustomizationSet())) {
                    n i15 = i10.x(customization2.getCustomizationSet()).i();
                    if (i15.D(customization2.getIdentifier())) {
                        String customizationSet = customization2.getCustomizationSet();
                        if (customizationSet == null) {
                            customizationSet = "";
                        }
                        int indexOf = C0.indexOf(customization2.getCustomizationSet());
                        String identifier2 = customization2.getIdentifier();
                        n i16 = i15.x(customization2.getIdentifier()).i();
                        q.h(i16, "getAsJsonObject(...)");
                        x0Var.add(parseBackground(customization2, customizationSet, indexOf, identifier2, i16));
                        i15.F(customization2.getIdentifier());
                    }
                }
            }
            for (Map.Entry<String, l> entry4 : i10.w()) {
                q.f(entry4);
                String key4 = entry4.getKey();
                for (Map.Entry<String, l> entry5 : entry4.getValue().i().w()) {
                    q.f(entry5);
                    String key5 = entry5.getKey();
                    l value = entry5.getValue();
                    q.f(key4);
                    int indexOf2 = C0.indexOf(key4);
                    n i17 = value.i();
                    q.h(i17, "getAsJsonObject(...)");
                    x0Var.add(parseBackground(null, key4, indexOf2, key5, i17));
                }
            }
        }
        Z0.close();
        return x0Var;
    }
}
