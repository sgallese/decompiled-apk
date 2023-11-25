package com.habitrpg.android.habitica.helpers;

import ad.k0;
import ad.l0;
import android.content.Context;
import androidx.preference.k;
import com.google.gson.reflect.TypeToken;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotionKt;
import com.habitrpg.android.habitica.models.promotions.HabiticaWebPromotion;
import com.habitrpg.common.habitica.helpers.AppTestingLevel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ec.s;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import yc.v;

/* compiled from: AppConfigManager.kt */
/* loaded from: classes4.dex */
public final class AppConfigManager extends com.habitrpg.common.habitica.helpers.AppConfigManager {
    public static final int $stable = 8;
    private final com.google.firebase.remoteconfig.a remoteConfig;
    private WorldState worldState;

    /* compiled from: AppConfigManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.AppConfigManager$1", f = "AppConfigManager.kt", l = {27}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.helpers.AppConfigManager$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ ContentRepository $contentRepository;
        int label;
        final /* synthetic */ AppConfigManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentRepository contentRepository, AppConfigManager appConfigManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$contentRepository = contentRepository;
            this.this$0 = appConfigManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$contentRepository, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            dd.g<WorldState> worldState;
            Object d10 = ic.b.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ContentRepository contentRepository = this.$contentRepository;
                if (contentRepository != null && (worldState = contentRepository.getWorldState()) != null) {
                    final AppConfigManager appConfigManager = this.this$0;
                    dd.h<? super WorldState> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.helpers.AppConfigManager.1.1
                        @Override // dd.h
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((WorldState) obj2, (Continuation<? super w>) continuation);
                        }

                        public final Object emit(WorldState worldState2, Continuation<? super w> continuation) {
                            AppConfigManager.this.worldState = worldState2;
                            return w.f13270a;
                        }
                    };
                    this.label = 1;
                    if (worldState.collect(hVar, this) == d10) {
                        return d10;
                    }
                }
            }
            return w.f13270a;
        }
    }

    public AppConfigManager(ContentRepository contentRepository) {
        try {
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(contentRepository, this, null), 1, null);
        } catch (IllegalStateException unused) {
        }
        com.google.firebase.remoteconfig.a m10 = com.google.firebase.remoteconfig.a.m();
        q.h(m10, "getInstance(...)");
        this.remoteConfig = m10;
    }

    public final HabiticaPromotion activePromo() {
        WorldStateEvent worldStateEvent;
        List<WorldStateEvent> d10;
        boolean u10;
        WorldState worldState = this.worldState;
        if (worldState == null || (d10 = worldState.getEvents()) == null) {
            WorldState worldState2 = this.worldState;
            if (worldState2 != null) {
                worldStateEvent = worldState2.getCurrentEvent();
            } else {
                worldStateEvent = null;
            }
            d10 = s.d(worldStateEvent);
        }
        HabiticaPromotion habiticaPromotion = null;
        for (WorldStateEvent worldStateEvent2 : d10) {
            if (worldStateEvent2 == null) {
                return null;
            }
            String promo = worldStateEvent2.getPromo();
            if (promo == null && (promo = worldStateEvent2.getEventKey()) == null) {
                promo = "";
            }
            HabiticaPromotion habiticaPromotionFromKey = HabiticaPromotionKt.getHabiticaPromotionFromKey(promo, worldStateEvent2.getStart(), worldStateEvent2.getEnd());
            if (habiticaPromotionFromKey != null) {
                habiticaPromotion = habiticaPromotionFromKey;
            }
        }
        boolean z10 = true;
        if (habiticaPromotion == null) {
            String p10 = this.remoteConfig.p("activePromo");
            q.h(p10, "getString(...)");
            u10 = v.u(p10);
            if ((!u10) != false) {
                String p11 = this.remoteConfig.p("activePromo");
                q.h(p11, "getString(...)");
                habiticaPromotion = HabiticaPromotionKt.getHabiticaPromotionFromKey(p11, null, null);
            }
        }
        if (habiticaPromotion == null || !habiticaPromotion.isActive()) {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        if (habiticaPromotion instanceof HabiticaWebPromotion) {
            ((HabiticaWebPromotion) habiticaPromotion).setUrl(surveyURL());
        }
        return habiticaPromotion;
    }

    public final boolean enableArmoireAds() {
        return this.remoteConfig.k("enableArmoireAds");
    }

    public final boolean enableArmoireSubs() {
        return this.remoteConfig.k("enableArmoireSubs");
    }

    public final boolean enableFaintAds() {
        return this.remoteConfig.k("enableFaintAds");
    }

    public final boolean enableFaintSubs() {
        return this.remoteConfig.k("enableFaintSubs");
    }

    public final boolean enableLocalChanges() {
        return this.remoteConfig.k("enableLocalChanges");
    }

    public final boolean enableLocalTaskScoring() {
        return this.remoteConfig.k("enableLocalTaskScoring");
    }

    public final boolean enableReviewPrompt() {
        return this.remoteConfig.k("enableReviewPrompt");
    }

    public final boolean enableSpellAds() {
        return this.remoteConfig.k("enableSpellAds");
    }

    public final boolean enableTaskDisplayMode() {
        if (!this.remoteConfig.k("enableTaskDisplayMode") && testingLevel() != AppTestingLevel.STAFF) {
            return false;
        }
        return true;
    }

    public final boolean enableUsernameAutocomplete() {
        return this.remoteConfig.k("enableUsernameAutocomplete");
    }

    public final String feedbackURL() {
        String p10 = this.remoteConfig.p("feedbackURL");
        q.h(p10, "getString(...)");
        return p10;
    }

    public final WorldStateEvent getBirthdayEvent() {
        Collection collection;
        String str;
        boolean z10;
        WorldStateEvent worldStateEvent;
        WorldState worldState = this.worldState;
        Object obj = null;
        if (worldState != null) {
            collection = worldState.getEvents();
        } else {
            collection = null;
        }
        if (!(collection instanceof List)) {
            collection = null;
        }
        if (collection == null) {
            WorldState worldState2 = this.worldState;
            if (worldState2 != null) {
                worldStateEvent = worldState2.getCurrentEvent();
            } else {
                worldStateEvent = null;
            }
            collection = s.d(worldStateEvent);
        }
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            WorldStateEvent worldStateEvent2 = (WorldStateEvent) next;
            if (worldStateEvent2 != null) {
                str = worldStateEvent2.getEventKey();
            } else {
                str = null;
            }
            boolean z11 = false;
            if (q.d(str, "birthday10")) {
                Date end = worldStateEvent2.getEnd();
                if (end != null && end.after(new Date())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (z11) {
                obj = next;
                break;
            }
        }
        return (WorldStateEvent) obj;
    }

    public final boolean hideChallenges() {
        return this.remoteConfig.k("hideChallenges");
    }

    public final boolean insufficientGemPurchase() {
        return this.remoteConfig.k("insufficientGemPurchase");
    }

    public final boolean insufficientGemPurchaseAdjust() {
        return this.remoteConfig.k("insufficientGemPurchaseAdjust");
    }

    public final List<Map<String, String>> knownIssues() {
        Object j10 = new com.google.gson.f().j(this.remoteConfig.p("knownIssues"), new TypeToken<List<? extends Map<String, ? extends String>>>() { // from class: com.habitrpg.android.habitica.helpers.AppConfigManager$knownIssues$type$1
        }.getType());
        q.h(j10, "fromJson(...)");
        return (List) j10;
    }

    public final long lastVersionCode() {
        return this.remoteConfig.o("lastVersionCode");
    }

    public final String lastVersionNumber() {
        String p10 = this.remoteConfig.p("lastVersionNumber");
        q.h(p10, "getString(...)");
        return p10;
    }

    public final long maxChatLength() {
        return this.remoteConfig.o("maxChatLength");
    }

    public final long minimumPasswordLength() {
        return this.remoteConfig.o("minimumPasswordLength");
    }

    public final boolean noPartyLinkPartyGuild() {
        return this.remoteConfig.k("noPartyLinkPartyGuild");
    }

    public final String shopSpriteSuffix() {
        String npcImageSuffix;
        WorldState worldState = this.worldState;
        if (worldState == null || (npcImageSuffix = worldState.getNpcImageSuffix()) == null) {
            String p10 = this.remoteConfig.p("shopSpriteSuffix");
            q.h(p10, "getString(...)");
            return p10;
        }
        return npcImageSuffix;
    }

    public final boolean showSubscriptionBanner() {
        return this.remoteConfig.k("showSubscriptionBanner");
    }

    @Override // com.habitrpg.common.habitica.helpers.AppConfigManager
    public Map<String, Map<String, String>> spriteSubstitutions() {
        Object j10 = new com.google.gson.f().j(this.remoteConfig.p("spriteSubstitutions"), new TypeToken<Map<String, ? extends Map<String, ? extends String>>>() { // from class: com.habitrpg.android.habitica.helpers.AppConfigManager$spriteSubstitutions$type$1
        }.getType());
        q.h(j10, "fromJson(...)");
        return (Map) j10;
    }

    public final String supportEmail() {
        String p10 = this.remoteConfig.p("supportEmail");
        q.h(p10, "getString(...)");
        return p10;
    }

    public final String surveyURL() {
        String p10 = this.remoteConfig.p("surveyURL");
        q.h(p10, "getString(...)");
        return p10;
    }

    public final String taskDisplayMode(Context context) {
        String string;
        q.i(context, "context");
        if (!enableTaskDisplayMode() || (string = k.b(context).getString("task_display", "standard")) == null) {
            return "standard";
        }
        return string;
    }

    public final AppTestingLevel testingLevel() {
        String upperCase = "production".toUpperCase(Locale.ROOT);
        q.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return AppTestingLevel.valueOf(upperCase);
    }
}
