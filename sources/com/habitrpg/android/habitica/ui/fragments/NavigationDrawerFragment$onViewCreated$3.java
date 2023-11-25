package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.NavigationDrawerAdapter;
import com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: NavigationDrawerFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3", f = "NavigationDrawerFragment.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NavigationDrawerFragment$onViewCreated$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ NavigationDrawerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavigationDrawerFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3$1", f = "NavigationDrawerFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.q<WorldState, List<? extends Item>, Continuation<? super dc.l<? extends WorldState, ? extends List<? extends Item>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // pc.q
        public final Object invoke(WorldState worldState, List<? extends Item> list, Continuation<? super dc.l<? extends WorldState, ? extends List<? extends Item>>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = worldState;
            anonymousClass1.L$1 = list;
            return anonymousClass1.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                return new dc.l((WorldState) this.L$0, (List) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$onViewCreated$3(NavigationDrawerFragment navigationDrawerFragment, Continuation<? super NavigationDrawerFragment$onViewCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = navigationDrawerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NavigationDrawerFragment$onViewCreated$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NavigationDrawerFragment$onViewCreated$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            dd.g A = dd.i.A(this.this$0.getContentRepository().getWorldState(), this.this$0.getInventoryRepository().getAvailableLimitedItems(), new AnonymousClass1(null));
            final NavigationDrawerFragment navigationDrawerFragment = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3.2

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: NavigationDrawerFragment.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends qc.r implements pc.a<Boolean> {
                    final /* synthetic */ WorldStateEvent $gearEvent;
                    final /* synthetic */ dc.l<WorldState, List<Item>> $pair;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(WorldStateEvent worldStateEvent, dc.l<? extends WorldState, ? extends List<? extends Item>> lVar) {
                        super(0);
                        this.$gearEvent = worldStateEvent;
                        this.$pair = lVar;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // pc.a
                    public final Boolean invoke() {
                        WorldStateEvent worldStateEvent = this.$gearEvent;
                        return Boolean.valueOf((worldStateEvent != null && worldStateEvent.isCurrentlyActive()) || (this.$pair.d().isEmpty() ^ true));
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: NavigationDrawerFragment.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3$2$2  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C02772 extends qc.r implements pc.a<zc.a> {
                    final /* synthetic */ WorldStateEvent $gearEvent;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02772(WorldStateEvent worldStateEvent) {
                        super(0);
                        this.$gearEvent = worldStateEvent;
                    }

                    @Override // pc.a
                    public /* bridge */ /* synthetic */ zc.a invoke() {
                        return zc.a.g(m59invokeUwyO8pc());
                    }

                    /* renamed from: invoke-UwyO8pc  reason: not valid java name */
                    public final long m59invokeUwyO8pc() {
                        long j10;
                        Date end;
                        WorldStateEvent worldStateEvent = this.$gearEvent;
                        if (worldStateEvent != null && (end = worldStateEvent.getEnd()) != null) {
                            j10 = end.getTime();
                        } else {
                            j10 = 0;
                        }
                        if (j10 - new Date().getTime() < zc.a.q(zc.c.o(1, zc.d.HOURS))) {
                            return zc.c.o(1, zc.d.SECONDS);
                        }
                        return zc.c.o(1, zc.d.MINUTES);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: NavigationDrawerFragment.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$onViewCreated$3$2$3  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass3 extends qc.r implements pc.a<dc.w> {
                    final /* synthetic */ WorldStateEvent $gearEvent;
                    final /* synthetic */ dc.l<WorldState, List<Item>> $pair;
                    final /* synthetic */ NavigationDrawerFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass3(NavigationDrawerFragment navigationDrawerFragment, WorldStateEvent worldStateEvent, dc.l<? extends WorldState, ? extends List<? extends Item>> lVar) {
                        super(0);
                        this.this$0 = navigationDrawerFragment;
                        this.$gearEvent = worldStateEvent;
                        this.$pair = lVar;
                    }

                    @Override // pc.a
                    public /* bridge */ /* synthetic */ dc.w invoke() {
                        invoke2();
                        return dc.w.f13270a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.updateSeasonalMenuEntries(this.$gearEvent, this.$pair.d());
                    }
                }

                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((dc.l) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(dc.l<? extends WorldState, ? extends List<? extends Item>> lVar, Continuation<? super dc.w> continuation) {
                    WorldStateEvent worldStateEvent;
                    HabiticaDrawerItem itemWithIdentifier;
                    NavigationDrawerAdapter navigationDrawerAdapter;
                    MainActivity mainActivity;
                    NavigationDrawerAdapter navigationDrawerAdapter2;
                    NavigationDrawerAdapter navigationDrawerAdapter3;
                    NavigationDrawerAdapter navigationDrawerAdapter4;
                    Iterator<WorldStateEvent> it = lVar.c().getEvents().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            worldStateEvent = null;
                            break;
                        }
                        worldStateEvent = it.next();
                        if (worldStateEvent.getGear()) {
                            break;
                        }
                    }
                    WorldStateEvent worldStateEvent2 = worldStateEvent;
                    NavigationDrawerFragment.this.createUpdatingJob("seasonal", new AnonymousClass1(worldStateEvent2, lVar), new C02772(worldStateEvent2), new AnonymousClass3(NavigationDrawerFragment.this, worldStateEvent2, lVar));
                    WorldStateEvent birthdayEvent = NavigationDrawerFragment.this.getConfigManager().getBirthdayEvent();
                    itemWithIdentifier = NavigationDrawerFragment.this.getItemWithIdentifier(NavigationDrawerFragment.SIDEBAR_BIRTHDAY);
                    if (birthdayEvent != null && itemWithIdentifier == null) {
                        navigationDrawerAdapter2 = NavigationDrawerFragment.this.adapter;
                        if (navigationDrawerAdapter2 == null) {
                            qc.q.z("adapter");
                            navigationDrawerAdapter2 = null;
                        }
                        navigationDrawerAdapter2.setCurrentEvent(birthdayEvent);
                        HabiticaDrawerItem habiticaDrawerItem = new HabiticaDrawerItem(R.id.birthdayActivity, NavigationDrawerFragment.SIDEBAR_BIRTHDAY);
                        habiticaDrawerItem.setItemViewType(kotlin.coroutines.jvm.internal.b.d(6));
                        ArrayList arrayList = new ArrayList();
                        navigationDrawerAdapter3 = NavigationDrawerFragment.this.adapter;
                        if (navigationDrawerAdapter3 == null) {
                            qc.q.z("adapter");
                            navigationDrawerAdapter3 = null;
                        }
                        arrayList.addAll(navigationDrawerAdapter3.getItems$Habitica_2311256681_prodRelease());
                        arrayList.add(0, habiticaDrawerItem);
                        navigationDrawerAdapter4 = NavigationDrawerFragment.this.adapter;
                        if (navigationDrawerAdapter4 == null) {
                            qc.q.z("adapter");
                            navigationDrawerAdapter4 = null;
                        }
                        navigationDrawerAdapter4.updateItems(arrayList);
                        androidx.fragment.app.q activity = NavigationDrawerFragment.this.getActivity();
                        mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.setShowBirthdayIcon(true);
                        }
                    } else if (birthdayEvent == null && itemWithIdentifier != null) {
                        itemWithIdentifier.setVisible(false);
                        navigationDrawerAdapter = NavigationDrawerFragment.this.adapter;
                        if (navigationDrawerAdapter == null) {
                            qc.q.z("adapter");
                            navigationDrawerAdapter = null;
                        }
                        navigationDrawerAdapter.updateItem(itemWithIdentifier);
                        androidx.fragment.app.q activity2 = NavigationDrawerFragment.this.getActivity();
                        mainActivity = activity2 instanceof MainActivity ? (MainActivity) activity2 : null;
                        if (mainActivity != null) {
                            mainActivity.setShowBirthdayIcon(false);
                        }
                    }
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (A.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
