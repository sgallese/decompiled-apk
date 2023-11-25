package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$useCustomization$2 extends r implements l<User, w> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $identifier;
    final /* synthetic */ String $type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$useCustomization$2(String str, String str2, String str3) {
        super(1);
        this.$type = str;
        this.$identifier = str2;
        this.$category = str3;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        Preferences preferences;
        String str;
        Hair hair;
        Preferences preferences2;
        Preferences preferences3;
        Preferences preferences4;
        q.i(user, "user");
        String str2 = this.$type;
        switch (str2.hashCode()) {
            case -1332194002:
                if (str2.equals("background") && (preferences = user.getPreferences()) != null) {
                    preferences.setBackground(this.$identifier);
                    return;
                }
                return;
            case 3194850:
                if (str2.equals("hair") && (str = this.$category) != null) {
                    switch (str.hashCode()) {
                        case -1271629221:
                            if (str.equals("flower")) {
                                Preferences preferences5 = user.getPreferences();
                                hair = preferences5 != null ? preferences5.getHair() : null;
                                if (hair == null) {
                                    return;
                                }
                                hair.setFlower(Integer.parseInt(this.$identifier));
                                return;
                            }
                            return;
                        case 3016401:
                            if (str.equals("base")) {
                                Preferences preferences6 = user.getPreferences();
                                hair = preferences6 != null ? preferences6.getHair() : null;
                                if (hair == null) {
                                    return;
                                }
                                hair.setBase(Integer.parseInt(this.$identifier));
                                return;
                            }
                            return;
                        case 93503803:
                            if (str.equals("bangs")) {
                                Preferences preferences7 = user.getPreferences();
                                hair = preferences7 != null ? preferences7.getHair() : null;
                                if (hair == null) {
                                    return;
                                }
                                hair.setBangs(Integer.parseInt(this.$identifier));
                                return;
                            }
                            return;
                        case 93610800:
                            if (str.equals("beard")) {
                                Preferences preferences8 = user.getPreferences();
                                hair = preferences8 != null ? preferences8.getHair() : null;
                                if (hair == null) {
                                    return;
                                }
                                hair.setBeard(Integer.parseInt(this.$identifier));
                                return;
                            }
                            return;
                        case 94842723:
                            if (str.equals("color")) {
                                Preferences preferences9 = user.getPreferences();
                                hair = preferences9 != null ? preferences9.getHair() : null;
                                if (hair == null) {
                                    return;
                                }
                                hair.setColor(this.$identifier);
                                return;
                            }
                            return;
                        case 853982760:
                            if (str.equals("mustache")) {
                                Preferences preferences10 = user.getPreferences();
                                hair = preferences10 != null ? preferences10.getHair() : null;
                                if (hair == null) {
                                    return;
                                }
                                hair.setMustache(Integer.parseInt(this.$identifier));
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 3532157:
                if (!str2.equals("skin") || (preferences2 = user.getPreferences()) == null) {
                    return;
                }
                preferences2.setSkin(this.$identifier);
                return;
            case 94623429:
                if (str2.equals("chair") && (preferences3 = user.getPreferences()) != null) {
                    preferences3.setChair(this.$identifier);
                    return;
                }
                return;
            case 109407734:
                if (str2.equals("shirt") && (preferences4 = user.getPreferences()) != null) {
                    preferences4.setShirt(this.$identifier);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
