package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import ad.u0;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import ec.b0;
import j0.j1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import x.x;
import yc.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragmentKt$PartyInviteView$1 extends qc.r implements pc.l<x, w> {
    final /* synthetic */ pc.a<w> $dismiss;
    final /* synthetic */ j1<LoadingButtonState> $inviteButtonState$delegate;
    final /* synthetic */ k0 $scope;
    final /* synthetic */ PartyInviteViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartyInviteFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends qc.r implements pc.q<x.d, j0.l, Integer, w> {
        final /* synthetic */ pc.a<w> $dismiss;
        final /* synthetic */ j1<LoadingButtonState> $inviteButtonState$delegate;
        final /* synthetic */ k0 $scope;
        final /* synthetic */ PartyInviteViewModel $viewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PartyInviteFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02892 extends qc.r implements pc.a<w> {
            final /* synthetic */ pc.a<w> $dismiss;
            final /* synthetic */ j1<LoadingButtonState> $inviteButtonState$delegate;
            final /* synthetic */ k0 $scope;
            final /* synthetic */ PartyInviteViewModel $viewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PartyInviteFragment.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2$2$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends qc.r implements pc.l<Throwable, w> {
                final /* synthetic */ j1<LoadingButtonState> $inviteButtonState$delegate;
                final /* synthetic */ k0 $scope;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PartyInviteFragment.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2$2$1$1", f = "PartyInviteFragment.kt", l = {258}, m = "invokeSuspend")
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2$2$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C02901 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
                    final /* synthetic */ j1<LoadingButtonState> $inviteButtonState$delegate;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02901(j1<LoadingButtonState> j1Var, Continuation<? super C02901> continuation) {
                        super(2, continuation);
                        this.$inviteButtonState$delegate = j1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                        return new C02901(this.$inviteButtonState$delegate, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                        return ((C02901) create(k0Var, continuation)).invokeSuspend(w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.label;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            long o10 = zc.c.o(2, zc.d.SECONDS);
                            this.label = 1;
                            if (u0.b(o10, this) == d10) {
                                return d10;
                            }
                        }
                        this.$inviteButtonState$delegate.setValue(LoadingButtonState.CONTENT);
                        return w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(k0 k0Var, j1<LoadingButtonState> j1Var) {
                    super(1);
                    this.$scope = k0Var;
                    this.$inviteButtonState$delegate = j1Var;
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                    invoke2(th);
                    return w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    qc.q.i(th, "it");
                    this.$inviteButtonState$delegate.setValue(LoadingButtonState.FAILED);
                    ExceptionHandlerKt.launchCatching$default(this.$scope, null, new C02901(this.$inviteButtonState$delegate, null), 1, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PartyInviteFragment.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2$2$2", f = "PartyInviteFragment.kt", l = {262, 265, 269}, m = "invokeSuspend")
            /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragmentKt$PartyInviteView$1$2$2$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02912 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
                final /* synthetic */ pc.a<w> $dismiss;
                final /* synthetic */ j1<LoadingButtonState> $inviteButtonState$delegate;
                final /* synthetic */ PartyInviteViewModel $viewModel;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02912(PartyInviteViewModel partyInviteViewModel, pc.a<w> aVar, j1<LoadingButtonState> j1Var, Continuation<? super C02912> continuation) {
                    super(2, continuation);
                    this.$viewModel = partyInviteViewModel;
                    this.$dismiss = aVar;
                    this.$inviteButtonState$delegate = j1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                    return new C02912(this.$viewModel, this.$dismiss, this.$inviteButtonState$delegate, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                    return ((C02912) create(k0Var, continuation)).invokeSuspend(w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    int i10;
                    d10 = ic.d.d();
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    dc.n.b(obj);
                                    this.$inviteButtonState$delegate.setValue(LoadingButtonState.CONTENT);
                                    return w.f13270a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dc.n.b(obj);
                            this.$dismiss.invoke();
                            return w.f13270a;
                        }
                        dc.n.b(obj);
                    } else {
                        dc.n.b(obj);
                        PartyInviteViewModel partyInviteViewModel = this.$viewModel;
                        this.label = 1;
                        obj = partyInviteViewModel.sendInvites(this);
                        if (obj == d10) {
                            return d10;
                        }
                    }
                    List list = (List) obj;
                    if (list != null) {
                        i10 = list.size();
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        this.$inviteButtonState$delegate.setValue(LoadingButtonState.SUCCESS);
                        long o10 = zc.c.o(2, zc.d.SECONDS);
                        this.label = 2;
                        if (u0.b(o10, this) == d10) {
                            return d10;
                        }
                        this.$dismiss.invoke();
                        return w.f13270a;
                    }
                    this.$inviteButtonState$delegate.setValue(LoadingButtonState.FAILED);
                    long o11 = zc.c.o(2, zc.d.SECONDS);
                    this.label = 3;
                    if (u0.b(o11, this) == d10) {
                        return d10;
                    }
                    this.$inviteButtonState$delegate.setValue(LoadingButtonState.CONTENT);
                    return w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02892(k0 k0Var, j1<LoadingButtonState> j1Var, PartyInviteViewModel partyInviteViewModel, pc.a<w> aVar) {
                super(0);
                this.$scope = k0Var;
                this.$inviteButtonState$delegate = j1Var;
                this.$viewModel = partyInviteViewModel;
                this.$dismiss = aVar;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$inviteButtonState$delegate.setValue(LoadingButtonState.LOADING);
                k0 k0Var = this.$scope;
                ExceptionHandlerKt.launchCatching(k0Var, new AnonymousClass1(k0Var, this.$inviteButtonState$delegate), new C02912(this.$viewModel, this.$dismiss, this.$inviteButtonState$delegate, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PartyInviteViewModel partyInviteViewModel, j1<LoadingButtonState> j1Var, k0 k0Var, pc.a<w> aVar) {
            super(3);
            this.$viewModel = partyInviteViewModel;
            this.$inviteButtonState$delegate = j1Var;
            this.$scope = k0Var;
            this.$dismiss = aVar;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ w invoke(x.d dVar, j0.l lVar, Integer num) {
            invoke(dVar, lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(x.d dVar, j0.l lVar, int i10) {
            boolean u10;
            qc.q.i(dVar, "$this$item");
            if ((i10 & 81) == 16 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(745350105, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteView.<anonymous>.<anonymous> (PartyInviteFragment.kt:249)");
            }
            t0.r<String> invites = this.$viewModel.getInvites();
            boolean z10 = false;
            if (!(invites instanceof Collection) || !invites.isEmpty()) {
                Iterator<String> it = invites.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u10 = v.u(it.next());
                    if ((!u10) != false) {
                        z10 = true;
                        break;
                    }
                }
            }
            PartySeekingFragmentKt.InviteButton(z10 ? PartyInviteFragmentKt.PartyInviteView$lambda$1(this.$inviteButtonState$delegate) : LoadingButtonState.DISABLED, new C02892(this.$scope, this.$inviteButtonState$delegate, this.$viewModel, this.$dismiss), androidx.compose.foundation.layout.m.h(androidx.compose.ui.e.f2335a, 0.0f, 1, null), false, lVar, 384, 8);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1(PartyInviteViewModel partyInviteViewModel, j1<LoadingButtonState> j1Var, k0 k0Var, pc.a<w> aVar) {
        super(1);
        this.$viewModel = partyInviteViewModel;
        this.$inviteButtonState$delegate = j1Var;
        this.$scope = k0Var;
        this.$dismiss = aVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(x xVar) {
        invoke2(xVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(x xVar) {
        vc.f j10;
        List C0;
        qc.q.i(xVar, "$this$LazyColumn");
        x.w.a(xVar, null, null, ComposableSingletons$PartyInviteFragmentKt.INSTANCE.m102getLambda1$Habitica_2311256681_prodRelease(), 3, null);
        j10 = ec.t.j(this.$viewModel.getInvites());
        C0 = b0.C0(j10);
        PartyInviteViewModel partyInviteViewModel = this.$viewModel;
        xVar.b(C0.size(), null, new PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$3(PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$1.INSTANCE, C0), q0.c.c(-632812321, true, new PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$4(C0, partyInviteViewModel)));
        x.w.a(xVar, null, null, q0.c.c(745350105, true, new AnonymousClass2(this.$viewModel, this.$inviteButtonState$delegate, this.$scope, this.$dismiss)), 3, null);
    }
}
