package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarStats;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.p7;
import qc.h;

/* compiled from: Stats.kt */
/* loaded from: classes4.dex */
public class Stats extends d1 implements AvatarStats, BaseObject, p7 {
    public static final String AUTO_ALLOCATE_CLASSBASED = "classbased";
    public static final String AUTO_ALLOCATE_FLAT = "flat";
    public static final String AUTO_ALLOCATE_TASKBASED = "taskbased";
    public static final String HEALER = "healer";
    public static final String MAGE = "wizard";
    public static final String ROGUE = "rogue";
    public static final String WARRIOR = "warrior";
    private Buffs buffs;
    @c("con")
    private Integer constitution;
    private Double exp;
    private Double gp;
    @c("class")
    private String habitClass;
    private Double hp;
    @c("int")
    private Integer intelligence;
    private Integer lvl;
    private Integer maxHealth;
    private Integer maxMP;
    private Double mp;
    @c("per")
    private Integer per;
    private Integer points;
    @c("str")
    private Integer strength;
    private Integer toNextLevel;
    private Training training;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Stats.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Stats() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Integer getConstitution() {
        return realmGet$constitution();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Double getExp() {
        return realmGet$exp();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Double getGp() {
        return realmGet$gp();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public String getHabitClass() {
        return realmGet$habitClass();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Double getHp() {
        return realmGet$hp();
    }

    public final Integer getIntelligence() {
        return realmGet$intelligence();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Integer getLvl() {
        return realmGet$lvl();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Integer getMaxHealth() {
        if (realmGet$maxHealth() != null) {
            return realmGet$maxHealth();
        }
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Integer getMaxMP() {
        if (realmGet$maxMP() != null) {
            return realmGet$maxMP();
        }
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Double getMp() {
        return realmGet$mp();
    }

    public final Integer getPer() {
        return realmGet$per();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Integer getPoints() {
        return realmGet$points();
    }

    public final Integer getStrength() {
        return realmGet$strength();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Integer getToNextLevel() {
        if (realmGet$toNextLevel() != null) {
            return realmGet$toNextLevel();
        }
        return 0;
    }

    public final Training getTraining() {
        return realmGet$training();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public boolean isBuffed() {
        return AvatarStats.DefaultImpls.isBuffed(this);
    }

    public final void merge(Stats stats) {
        Integer realmGet$constitution;
        Integer realmGet$strength;
        Integer realmGet$per;
        Integer realmGet$intelligence;
        Integer points;
        Integer lvl;
        String habitClass;
        Double gp;
        Double exp;
        Double hp;
        Double mp;
        Integer toNextLevel;
        Integer maxHealth;
        Integer maxMP;
        if (stats == null) {
            return;
        }
        if (stats.realmGet$constitution() != null) {
            realmGet$constitution = stats.realmGet$constitution();
        } else {
            realmGet$constitution = realmGet$constitution();
        }
        realmSet$constitution(realmGet$constitution);
        if (stats.realmGet$strength() != null) {
            realmGet$strength = stats.realmGet$strength();
        } else {
            realmGet$strength = realmGet$strength();
        }
        realmSet$strength(realmGet$strength);
        if (stats.realmGet$per() != null) {
            realmGet$per = stats.realmGet$per();
        } else {
            realmGet$per = realmGet$per();
        }
        realmSet$per(realmGet$per);
        if (stats.realmGet$intelligence() != null) {
            realmGet$intelligence = stats.realmGet$intelligence();
        } else {
            realmGet$intelligence = realmGet$intelligence();
        }
        realmSet$intelligence(realmGet$intelligence);
        Training realmGet$training = realmGet$training();
        if (realmGet$training != null) {
            realmGet$training.merge(stats.realmGet$training());
        }
        Buffs buffs = getBuffs();
        if (buffs != null) {
            buffs.merge(stats.getBuffs());
        }
        if (stats.getPoints() != null) {
            points = stats.getPoints();
        } else {
            points = getPoints();
        }
        setPoints(points);
        if (stats.getLvl() != null) {
            lvl = stats.getLvl();
        } else {
            lvl = getLvl();
        }
        setLvl(lvl);
        if (stats.getHabitClass() != null) {
            habitClass = stats.getHabitClass();
        } else {
            habitClass = getHabitClass();
        }
        setHabitClass(habitClass);
        if (stats.getGp() != null) {
            gp = stats.getGp();
        } else {
            gp = getGp();
        }
        setGp(gp);
        if (stats.getExp() != null) {
            exp = stats.getExp();
        } else {
            exp = getExp();
        }
        setExp(exp);
        if (stats.getHp() != null) {
            hp = stats.getHp();
        } else {
            hp = getHp();
        }
        setHp(hp);
        if (stats.getMp() != null) {
            mp = stats.getMp();
        } else {
            mp = getMp();
        }
        setMp(mp);
        if (stats.getToNextLevel() != null) {
            toNextLevel = stats.getToNextLevel();
        } else {
            toNextLevel = getToNextLevel();
        }
        setToNextLevel(toNextLevel);
        if (stats.getMaxHealth() != null) {
            maxHealth = stats.getMaxHealth();
        } else {
            maxHealth = getMaxHealth();
        }
        setMaxHealth(maxHealth);
        if (stats.getMaxMP() != null) {
            maxMP = stats.getMaxMP();
        } else {
            maxMP = getMaxMP();
        }
        setMaxMP(maxMP);
    }

    @Override // io.realm.p7
    public Buffs realmGet$buffs() {
        return this.buffs;
    }

    @Override // io.realm.p7
    public Integer realmGet$constitution() {
        return this.constitution;
    }

    @Override // io.realm.p7
    public Double realmGet$exp() {
        return this.exp;
    }

    @Override // io.realm.p7
    public Double realmGet$gp() {
        return this.gp;
    }

    @Override // io.realm.p7
    public String realmGet$habitClass() {
        return this.habitClass;
    }

    @Override // io.realm.p7
    public Double realmGet$hp() {
        return this.hp;
    }

    @Override // io.realm.p7
    public Integer realmGet$intelligence() {
        return this.intelligence;
    }

    @Override // io.realm.p7
    public Integer realmGet$lvl() {
        return this.lvl;
    }

    @Override // io.realm.p7
    public Integer realmGet$maxHealth() {
        return this.maxHealth;
    }

    @Override // io.realm.p7
    public Integer realmGet$maxMP() {
        return this.maxMP;
    }

    @Override // io.realm.p7
    public Double realmGet$mp() {
        return this.mp;
    }

    @Override // io.realm.p7
    public Integer realmGet$per() {
        return this.per;
    }

    @Override // io.realm.p7
    public Integer realmGet$points() {
        return this.points;
    }

    @Override // io.realm.p7
    public Integer realmGet$strength() {
        return this.strength;
    }

    @Override // io.realm.p7
    public Integer realmGet$toNextLevel() {
        return this.toNextLevel;
    }

    @Override // io.realm.p7
    public Training realmGet$training() {
        return this.training;
    }

    @Override // io.realm.p7
    public void realmSet$buffs(Buffs buffs) {
        this.buffs = buffs;
    }

    @Override // io.realm.p7
    public void realmSet$constitution(Integer num) {
        this.constitution = num;
    }

    @Override // io.realm.p7
    public void realmSet$exp(Double d10) {
        this.exp = d10;
    }

    @Override // io.realm.p7
    public void realmSet$gp(Double d10) {
        this.gp = d10;
    }

    @Override // io.realm.p7
    public void realmSet$habitClass(String str) {
        this.habitClass = str;
    }

    @Override // io.realm.p7
    public void realmSet$hp(Double d10) {
        this.hp = d10;
    }

    @Override // io.realm.p7
    public void realmSet$intelligence(Integer num) {
        this.intelligence = num;
    }

    @Override // io.realm.p7
    public void realmSet$lvl(Integer num) {
        this.lvl = num;
    }

    @Override // io.realm.p7
    public void realmSet$maxHealth(Integer num) {
        this.maxHealth = num;
    }

    @Override // io.realm.p7
    public void realmSet$maxMP(Integer num) {
        this.maxMP = num;
    }

    @Override // io.realm.p7
    public void realmSet$mp(Double d10) {
        this.mp = d10;
    }

    @Override // io.realm.p7
    public void realmSet$per(Integer num) {
        this.per = num;
    }

    @Override // io.realm.p7
    public void realmSet$points(Integer num) {
        this.points = num;
    }

    @Override // io.realm.p7
    public void realmSet$strength(Integer num) {
        this.strength = num;
    }

    @Override // io.realm.p7
    public void realmSet$toNextLevel(Integer num) {
        this.toNextLevel = num;
    }

    @Override // io.realm.p7
    public void realmSet$training(Training training) {
        this.training = training;
    }

    public void setBuffs(Buffs buffs) {
        realmSet$buffs(buffs);
    }

    public final void setConstitution(Integer num) {
        realmSet$constitution(num);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setExp(Double d10) {
        realmSet$exp(d10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setGp(Double d10) {
        realmSet$gp(d10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setHabitClass(String str) {
        realmSet$habitClass(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setHp(Double d10) {
        realmSet$hp(d10);
    }

    public final void setIntelligence(Integer num) {
        realmSet$intelligence(num);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setLvl(Integer num) {
        realmSet$lvl(num);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setMaxHealth(Integer num) {
        if (num == null || num.intValue() != 0) {
            realmSet$maxHealth(num);
        }
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setMaxMP(Integer num) {
        if (num == null || num.intValue() != 0) {
            realmSet$maxMP(num);
        }
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setMp(Double d10) {
        realmSet$mp(d10);
    }

    public final void setPer(Integer num) {
        realmSet$per(num);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setPoints(Integer num) {
        realmSet$points(num);
    }

    public final void setStrength(Integer num) {
        realmSet$strength(num);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public void setToNextLevel(Integer num) {
        if (num == null || num.intValue() != 0) {
            realmSet$toNextLevel(num);
        }
    }

    public final void setTraining(Training training) {
        realmSet$training(training);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarStats
    public Buffs getBuffs() {
        return realmGet$buffs();
    }
}
