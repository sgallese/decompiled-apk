package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import ad.k0;
import ad.u0;
import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuildDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1", f = "GuildDetailFragment.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GuildDetailFragment$leaveGuild$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<Challenge> $groupChallenges;
    int label;
    final /* synthetic */ GuildDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GuildDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ List<Challenge> $groupChallenges;
        final /* synthetic */ GuildDetailFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GuildDetailFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02851 extends r implements pc.a<w> {
            final /* synthetic */ GuildDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02851(GuildDetailFragment guildDetailFragment) {
                super(0);
                this.this$0 = guildDetailFragment;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.showLeaveSnackbar();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(GuildDetailFragment guildDetailFragment, List<? extends Challenge> list) {
            super(2);
            this.this$0 = guildDetailFragment;
            this.$groupChallenges = list;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            this.this$0.getViewModel().leaveGroup(this.$groupChallenges, true, new C02851(this.this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GuildDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ List<Challenge> $groupChallenges;
        final /* synthetic */ GuildDetailFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GuildDetailFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends r implements pc.a<w> {
            final /* synthetic */ GuildDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GuildDetailFragment guildDetailFragment) {
                super(0);
                this.this$0 = guildDetailFragment;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.showLeaveSnackbar();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(GuildDetailFragment guildDetailFragment, List<? extends Challenge> list) {
            super(2);
            this.this$0 = guildDetailFragment;
            this.$groupChallenges = list;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            this.this$0.getViewModel().leaveGroup(this.$groupChallenges, false, new AnonymousClass1(this.this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GuildDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ List<Challenge> $groupChallenges;
        final /* synthetic */ GuildDetailFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GuildDetailFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment$leaveGuild$1$3$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends r implements pc.a<w> {
            final /* synthetic */ GuildDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GuildDetailFragment guildDetailFragment) {
                super(0);
                this.this$0 = guildDetailFragment;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.showLeaveSnackbar();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(GuildDetailFragment guildDetailFragment, List<? extends Challenge> list) {
            super(2);
            this.this$0 = guildDetailFragment;
            this.$groupChallenges = list;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            this.this$0.getViewModel().leaveGroup(this.$groupChallenges, false, new AnonymousClass1(this.this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GuildDetailFragment$leaveGuild$1(List<? extends Challenge> list, Context context, GuildDetailFragment guildDetailFragment, Continuation<? super GuildDetailFragment$leaveGuild$1> continuation) {
        super(2, continuation);
        this.$groupChallenges = list;
        this.$context = context;
        this.this$0 = guildDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GuildDetailFragment$leaveGuild$1(this.$groupChallenges, this.$context, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GuildDetailFragment$leaveGuild$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.label = 1;
            if (u0.a(500L, this) == d10) {
                return d10;
            }
        }
        if ((!this.$groupChallenges.isEmpty()) != false) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this.$context);
            habiticaAlertDialog.setTitle(R.string.guild_challenges);
            habiticaAlertDialog.setMessage(R.string.leave_guild_challenges_confirmation);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.keep_challenges, true, false, false, (p) new AnonymousClass1(this.this$0, this.$groupChallenges), 12, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.leave_challenges_delete_tasks, false, true, false, (p) new AnonymousClass2(this.this$0, this.$groupChallenges), 8, (Object) null);
            habiticaAlertDialog.setExtraCloseButtonVisibility(0);
            habiticaAlertDialog.show();
        } else {
            HabiticaAlertDialog habiticaAlertDialog2 = new HabiticaAlertDialog(this.$context);
            habiticaAlertDialog2.setTitle(R.string.leave_guild_confirmation);
            habiticaAlertDialog2.setMessage(R.string.rejoin_guild);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.leave, true, true, false, (p) new AnonymousClass3(this.this$0, this.$groupChallenges), 8, (Object) null);
            habiticaAlertDialog2.setExtraCloseButtonVisibility(0);
            habiticaAlertDialog2.show();
        }
        return w.f13270a;
    }
}
