package io.realm;

import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.Training;

/* compiled from: com_habitrpg_android_habitica_models_user_StatsRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface p7 {
    Buffs realmGet$buffs();

    Integer realmGet$constitution();

    Double realmGet$exp();

    Double realmGet$gp();

    String realmGet$habitClass();

    Double realmGet$hp();

    Integer realmGet$intelligence();

    Integer realmGet$lvl();

    Integer realmGet$maxHealth();

    Integer realmGet$maxMP();

    Double realmGet$mp();

    Integer realmGet$per();

    Integer realmGet$points();

    Integer realmGet$strength();

    Integer realmGet$toNextLevel();

    Training realmGet$training();

    void realmSet$buffs(Buffs buffs);

    void realmSet$constitution(Integer num);

    void realmSet$exp(Double d10);

    void realmSet$gp(Double d10);

    void realmSet$habitClass(String str);

    void realmSet$hp(Double d10);

    void realmSet$intelligence(Integer num);

    void realmSet$lvl(Integer num);

    void realmSet$maxHealth(Integer num);

    void realmSet$maxMP(Integer num);

    void realmSet$mp(Double d10);

    void realmSet$per(Integer num);

    void realmSet$points(Integer num);

    void realmSet$strength(Integer num);

    void realmSet$toNextLevel(Integer num);

    void realmSet$training(Training training);
}
