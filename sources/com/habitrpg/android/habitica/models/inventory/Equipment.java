package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseMainObject;
import fa.c;
import io.realm.a1;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.n2;
import qc.q;

/* compiled from: Equipment.kt */
/* loaded from: classes4.dex */
public class Equipment extends d1 implements BaseMainObject, n2 {
    public static final int $stable = 8;
    @c("int")
    private int _int;
    private int con;
    private String gearSet;
    private String index;
    private String key;
    private String klass;
    private String mystery;
    private String notes;
    private Boolean owned;
    private int per;
    private String specialClass;
    private int str;
    private String text;
    private boolean twoHanded;
    private String type;
    private double value;

    public Equipment() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$type("");
        realmSet$key("");
        realmSet$klass("");
        realmSet$specialClass("");
        realmSet$index("");
        realmSet$text("");
        realmSet$notes("");
        realmSet$mystery("");
        realmSet$gearSet("");
    }

    public final int getCon() {
        return realmGet$con();
    }

    public final String getGearSet() {
        return realmGet$gearSet();
    }

    public final String getIndex() {
        return realmGet$index();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getKlass() {
        return realmGet$klass();
    }

    public final String getMystery() {
        return realmGet$mystery();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final Boolean getOwned() {
        return realmGet$owned();
    }

    public final int getPer() {
        return realmGet$per();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$key();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "key";
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<? extends a1> getRealmClass() {
        return Equipment.class;
    }

    public final String getSpecialClass() {
        return realmGet$specialClass();
    }

    public final int getStr() {
        return realmGet$str();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final boolean getTwoHanded() {
        return realmGet$twoHanded();
    }

    public final String getType() {
        return realmGet$type();
    }

    public final double getValue() {
        return realmGet$value();
    }

    public final int get_int() {
        return realmGet$_int();
    }

    @Override // io.realm.n2
    public int realmGet$_int() {
        return this._int;
    }

    @Override // io.realm.n2
    public int realmGet$con() {
        return this.con;
    }

    @Override // io.realm.n2
    public String realmGet$gearSet() {
        return this.gearSet;
    }

    @Override // io.realm.n2
    public String realmGet$index() {
        return this.index;
    }

    @Override // io.realm.n2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.n2
    public String realmGet$klass() {
        return this.klass;
    }

    @Override // io.realm.n2
    public String realmGet$mystery() {
        return this.mystery;
    }

    @Override // io.realm.n2
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.n2
    public Boolean realmGet$owned() {
        return this.owned;
    }

    @Override // io.realm.n2
    public int realmGet$per() {
        return this.per;
    }

    @Override // io.realm.n2
    public String realmGet$specialClass() {
        return this.specialClass;
    }

    @Override // io.realm.n2
    public int realmGet$str() {
        return this.str;
    }

    @Override // io.realm.n2
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.n2
    public boolean realmGet$twoHanded() {
        return this.twoHanded;
    }

    @Override // io.realm.n2
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.n2
    public double realmGet$value() {
        return this.value;
    }

    @Override // io.realm.n2
    public void realmSet$_int(int i10) {
        this._int = i10;
    }

    @Override // io.realm.n2
    public void realmSet$con(int i10) {
        this.con = i10;
    }

    @Override // io.realm.n2
    public void realmSet$gearSet(String str) {
        this.gearSet = str;
    }

    @Override // io.realm.n2
    public void realmSet$index(String str) {
        this.index = str;
    }

    @Override // io.realm.n2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.n2
    public void realmSet$klass(String str) {
        this.klass = str;
    }

    @Override // io.realm.n2
    public void realmSet$mystery(String str) {
        this.mystery = str;
    }

    @Override // io.realm.n2
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.n2
    public void realmSet$owned(Boolean bool) {
        this.owned = bool;
    }

    @Override // io.realm.n2
    public void realmSet$per(int i10) {
        this.per = i10;
    }

    @Override // io.realm.n2
    public void realmSet$specialClass(String str) {
        this.specialClass = str;
    }

    @Override // io.realm.n2
    public void realmSet$str(int i10) {
        this.str = i10;
    }

    @Override // io.realm.n2
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.n2
    public void realmSet$twoHanded(boolean z10) {
        this.twoHanded = z10;
    }

    @Override // io.realm.n2
    public void realmSet$type(String str) {
        this.type = str;
    }

    @Override // io.realm.n2
    public void realmSet$value(double d10) {
        this.value = d10;
    }

    public final void setCon(int i10) {
        realmSet$con(i10);
    }

    public final void setGearSet(String str) {
        q.i(str, "<set-?>");
        realmSet$gearSet(str);
    }

    public final void setIndex(String str) {
        q.i(str, "<set-?>");
        realmSet$index(str);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setKlass(String str) {
        q.i(str, "<set-?>");
        realmSet$klass(str);
    }

    public final void setMystery(String str) {
        q.i(str, "<set-?>");
        realmSet$mystery(str);
    }

    public final void setNotes(String str) {
        q.i(str, "<set-?>");
        realmSet$notes(str);
    }

    public final void setOwned(Boolean bool) {
        realmSet$owned(bool);
    }

    public final void setPer(int i10) {
        realmSet$per(i10);
    }

    public final void setSpecialClass(String str) {
        q.i(str, "<set-?>");
        realmSet$specialClass(str);
    }

    public final void setStr(int i10) {
        realmSet$str(i10);
    }

    public final void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }

    public final void setTwoHanded(boolean z10) {
        realmSet$twoHanded(z10);
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    public final void setValue(double d10) {
        realmSet$value(d10);
    }

    public final void set_int(int i10) {
        realmSet$_int(i10);
    }
}
