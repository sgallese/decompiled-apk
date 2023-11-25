package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarBuffs;
import fa.c;
import io.realm.d1;
import io.realm.d6;
import io.realm.internal.o;

/* compiled from: Buffs.kt */
/* loaded from: classes4.dex */
public class Buffs extends d1 implements AvatarBuffs, BaseObject, d6 {
    public static final int $stable = 8;
    @c("int")
    private Float _int;
    private Float con;
    private Float per;
    private Boolean seafoam;
    private Boolean shinySeed;
    private Boolean snowball;
    private Boolean spookySparkles;
    private Float str;
    private Boolean streaks;

    public Buffs() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Float getCon() {
        return realmGet$con();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Float getPer() {
        return realmGet$per();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Boolean getSeafoam() {
        Boolean realmGet$seafoam = realmGet$seafoam();
        if (realmGet$seafoam == null) {
            return Boolean.FALSE;
        }
        return realmGet$seafoam;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Boolean getShinySeed() {
        Boolean realmGet$shinySeed = realmGet$shinySeed();
        if (realmGet$shinySeed == null) {
            return Boolean.FALSE;
        }
        return realmGet$shinySeed;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Boolean getSnowball() {
        Boolean realmGet$snowball = realmGet$snowball();
        if (realmGet$snowball == null) {
            return Boolean.FALSE;
        }
        return realmGet$snowball;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Boolean getSpookySparkles() {
        Boolean realmGet$spookySparkles = realmGet$spookySparkles();
        if (realmGet$spookySparkles == null) {
            return Boolean.FALSE;
        }
        return realmGet$spookySparkles;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Float getStr() {
        return realmGet$str();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Boolean getStreaks() {
        Boolean realmGet$streaks = realmGet$streaks();
        if (realmGet$streaks == null) {
            return Boolean.FALSE;
        }
        return realmGet$streaks;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public Float get_int() {
        return realmGet$_int();
    }

    public final void merge(Buffs buffs) {
        Float con;
        Float str;
        Float per;
        Float f10;
        Boolean snowball;
        Boolean streaks;
        Boolean seafoam;
        Boolean shinySeed;
        Boolean spookySparkles;
        if (buffs == null) {
            return;
        }
        if (buffs.getCon() != null) {
            con = buffs.getCon();
        } else {
            con = getCon();
        }
        setCon(con);
        if (buffs.getStr() != null) {
            str = buffs.getStr();
        } else {
            str = getStr();
        }
        setStr(str);
        if (buffs.getPer() != null) {
            per = buffs.getPer();
        } else {
            per = getPer();
        }
        setPer(per);
        if (buffs.get_int() != null) {
            f10 = buffs.get_int();
        } else {
            f10 = get_int();
        }
        set_int(f10);
        if (buffs.getSnowball() != null) {
            snowball = buffs.getSnowball();
        } else {
            snowball = getSnowball();
        }
        setSnowball(snowball);
        if (buffs.getStreaks() != null) {
            streaks = buffs.getStreaks();
        } else {
            streaks = getStreaks();
        }
        setStreaks(streaks);
        if (buffs.getSeafoam() != null) {
            seafoam = buffs.getSeafoam();
        } else {
            seafoam = getSeafoam();
        }
        setSeafoam(seafoam);
        if (buffs.getShinySeed() != null) {
            shinySeed = buffs.getShinySeed();
        } else {
            shinySeed = getShinySeed();
        }
        setShinySeed(shinySeed);
        if (buffs.getSpookySparkles() != null) {
            spookySparkles = buffs.getSpookySparkles();
        } else {
            spookySparkles = getSpookySparkles();
        }
        setSpookySparkles(spookySparkles);
    }

    @Override // io.realm.d6
    public Float realmGet$_int() {
        return this._int;
    }

    @Override // io.realm.d6
    public Float realmGet$con() {
        return this.con;
    }

    @Override // io.realm.d6
    public Float realmGet$per() {
        return this.per;
    }

    @Override // io.realm.d6
    public Boolean realmGet$seafoam() {
        return this.seafoam;
    }

    @Override // io.realm.d6
    public Boolean realmGet$shinySeed() {
        return this.shinySeed;
    }

    @Override // io.realm.d6
    public Boolean realmGet$snowball() {
        return this.snowball;
    }

    @Override // io.realm.d6
    public Boolean realmGet$spookySparkles() {
        return this.spookySparkles;
    }

    @Override // io.realm.d6
    public Float realmGet$str() {
        return this.str;
    }

    @Override // io.realm.d6
    public Boolean realmGet$streaks() {
        return this.streaks;
    }

    @Override // io.realm.d6
    public void realmSet$_int(Float f10) {
        this._int = f10;
    }

    @Override // io.realm.d6
    public void realmSet$con(Float f10) {
        this.con = f10;
    }

    @Override // io.realm.d6
    public void realmSet$per(Float f10) {
        this.per = f10;
    }

    @Override // io.realm.d6
    public void realmSet$seafoam(Boolean bool) {
        this.seafoam = bool;
    }

    @Override // io.realm.d6
    public void realmSet$shinySeed(Boolean bool) {
        this.shinySeed = bool;
    }

    @Override // io.realm.d6
    public void realmSet$snowball(Boolean bool) {
        this.snowball = bool;
    }

    @Override // io.realm.d6
    public void realmSet$spookySparkles(Boolean bool) {
        this.spookySparkles = bool;
    }

    @Override // io.realm.d6
    public void realmSet$str(Float f10) {
        this.str = f10;
    }

    @Override // io.realm.d6
    public void realmSet$streaks(Boolean bool) {
        this.streaks = bool;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setCon(Float f10) {
        realmSet$con(f10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setPer(Float f10) {
        realmSet$per(f10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setSeafoam(Boolean bool) {
        realmSet$seafoam(bool);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setShinySeed(Boolean bool) {
        realmSet$shinySeed(bool);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setSnowball(Boolean bool) {
        realmSet$snowball(bool);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setSpookySparkles(Boolean bool) {
        realmSet$spookySparkles(bool);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setStr(Float f10) {
        realmSet$str(f10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void setStreaks(Boolean bool) {
        realmSet$streaks(bool);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarBuffs
    public void set_int(Float f10) {
        realmSet$_int(f10);
    }
}
