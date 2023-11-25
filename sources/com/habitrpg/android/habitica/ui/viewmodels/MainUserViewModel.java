package com.habitrpg.android.habitica.ui.viewmodels;

import ad.l0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserTaskPreferences;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dd.d0;
import dd.g;
import dd.h;
import dd.i;
import dd.w;
import ec.t;
import io.realm.x0;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.q;

/* compiled from: MainUserViewModel.kt */
/* loaded from: classes4.dex */
public final class MainUserViewModel {
    public static final int $stable = 8;
    private final AuthenticationHandler authenticationHandler;
    private w<TeamPlan> currentTeamPlan;
    private g<? extends Group> currentTeamPlanGroup;
    private LiveData<List<Member>> currentTeamPlanMembers;
    private final SocialRepository socialRepository;
    private final LiveData<User> user;
    private final UserRepository userRepository;

    public MainUserViewModel(AuthenticationHandler authenticationHandler, UserRepository userRepository, SocialRepository socialRepository) {
        q.i(authenticationHandler, "authenticationHandler");
        q.i(userRepository, "userRepository");
        q.i(socialRepository, "socialRepository");
        this.authenticationHandler = authenticationHandler;
        this.userRepository = userRepository;
        this.socialRepository = socialRepository;
        this.user = m.c(userRepository.getUser(), null, 0L, 3, null);
        final w<TeamPlan> b10 = d0.b(1, 0, cd.a.DROP_OLDEST, 2, null);
        this.currentTeamPlan = b10;
        this.currentTeamPlanGroup = i.R(i.u(i.m(new g<String>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1$2", f = "MainUserViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.TeamPlan r5 = (com.habitrpg.android.habitica.models.TeamPlan) r5
                        if (r5 == 0) goto L3f
                        java.lang.String r5 = r5.getId()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super String> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return dc.w.f13270a;
            }
        }, MainUserViewModel$currentTeamPlanGroup$2.INSTANCE)), new MainUserViewModel$special$$inlined$flatMapLatest$1(null, this));
        final w<TeamPlan> wVar = this.currentTeamPlan;
        this.currentTeamPlanMembers = m.c(i.J(i.m(i.R(i.u(i.m(new g<String>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2$2", f = "MainUserViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.TeamPlan r5 = (com.habitrpg.android.habitica.models.TeamPlan) r5
                        if (r5 == 0) goto L3f
                        java.lang.String r5 = r5.getId()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super String> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return dc.w.f13270a;
            }
        }, MainUserViewModel$currentTeamPlanMembers$2.INSTANCE)), new MainUserViewModel$special$$inlined$flatMapLatest$2(null, this)), MainUserViewModel$currentTeamPlanMembers$4.INSTANCE), new MainUserViewModel$currentTeamPlanMembers$5(this, null)), null, 0L, 3, null);
    }

    public final w<TeamPlan> getCurrentTeamPlan() {
        return this.currentTeamPlan;
    }

    public final g<Group> getCurrentTeamPlanGroup() {
        return this.currentTeamPlanGroup;
    }

    public final LiveData<List<Member>> getCurrentTeamPlanMembers() {
        return this.currentTeamPlanMembers;
    }

    public final CharSequence getDisplayName() {
        Profile profile;
        String name;
        User f10 = this.user.f();
        if (f10 == null || (profile = f10.getProfile()) == null || (name = profile.getName()) == null) {
            return "";
        }
        return name;
    }

    public final CharSequence getFormattedUsername() {
        User f10 = this.user.f();
        if (f10 != null) {
            return f10.getFormattedUsername();
        }
        return null;
    }

    public final List<String> getMirrorGroupTasks() {
        List<String> i10;
        Preferences preferences;
        UserTaskPreferences tasks;
        x0<String> mirrorGroupTasks;
        User f10 = this.user.f();
        if (f10 == null || (preferences = f10.getPreferences()) == null || (tasks = preferences.getTasks()) == null || (mirrorGroupTasks = tasks.getMirrorGroupTasks()) == null) {
            i10 = t.i();
            return i10;
        }
        return mirrorGroupTasks;
    }

    public final String getPartyID() {
        UserParty party;
        User f10 = this.user.f();
        if (f10 != null && (party = f10.getParty()) != null) {
            return party.getId();
        }
        return null;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    public final LiveData<User> getUser() {
        return this.user;
    }

    public final String getUserID() {
        String id2;
        User f10 = this.user.f();
        if (f10 == null || (id2 = f10.getId()) == null) {
            String currentUserID = this.authenticationHandler.getCurrentUserID();
            if (currentUserID == null) {
                return "";
            }
            return currentUserID;
        }
        return id2;
    }

    public final UserRepository getUserRepository() {
        return this.userRepository;
    }

    public final CharSequence getUsername() {
        String username;
        User f10 = this.user.f();
        if (f10 == null || (username = f10.getUsername()) == null) {
            return "";
        }
        return username;
    }

    public final boolean isUserFainted() {
        double d10;
        Stats stats;
        Double hp;
        User f10 = this.user.f();
        if (f10 != null && (stats = f10.getStats()) != null && (hp = stats.getHp()) != null) {
            d10 = hp.doubleValue();
        } else {
            d10 = 1.0d;
        }
        if (d10 == 0.0d) {
            return true;
        }
        return false;
    }

    public final boolean isUserInParty() {
        User f10 = this.user.f();
        if (f10 == null || !f10.getHasParty()) {
            return false;
        }
        return true;
    }

    public final void onCleared() {
        this.userRepository.close();
    }

    public final void setCurrentTeamPlan(w<TeamPlan> wVar) {
        q.i(wVar, "<set-?>");
        this.currentTeamPlan = wVar;
    }

    public final void setCurrentTeamPlanGroup(g<? extends Group> gVar) {
        q.i(gVar, "<set-?>");
        this.currentTeamPlanGroup = gVar;
    }

    public final void setCurrentTeamPlanMembers(LiveData<List<Member>> liveData) {
        q.i(liveData, "<set-?>");
        this.currentTeamPlanMembers = liveData;
    }

    public final void updateUser(String str, Object obj) {
        q.i(str, "path");
        q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ad.g.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MainUserViewModel$updateUser$1(this, str, obj, null), 2, null);
    }

    public final void updateUser(Map<String, ? extends Object> map) {
        q.i(map, "data");
        ad.g.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MainUserViewModel$updateUser$2(this, map, null), 2, null);
    }

    public static /* synthetic */ void getCurrentTeamPlanGroup$annotations() {
    }

    public static /* synthetic */ void getCurrentTeamPlanMembers$annotations() {
    }
}
