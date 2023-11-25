package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.user.OwnedObject;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ec.t;
import ic.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StableViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1", f = "StableViewModel.kt", l = {60, 62, 75}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class StableViewModel$loadItems$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ StableViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableViewModel$loadItems$1(StableViewModel stableViewModel, Continuation<? super StableViewModel$loadItems$1> continuation) {
        super(2, continuation);
        this.this$0 = stableViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new StableViewModel$loadItems$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((StableViewModel$loadItems$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        final List list;
        final g ownedMounts;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                list = (List) obj;
            } else {
                n.b(obj);
                list = (List) obj;
            }
        } else {
            n.b(obj);
            if (q.d("pets", this.this$0.getItemType$Habitica_2311256681_prodRelease())) {
                g<List<Pet>> pets = this.this$0.getInventoryRepository().getPets();
                this.label = 1;
                obj = i.x(pets, this);
                if (obj == d10) {
                    return d10;
                }
                list = (List) obj;
            } else {
                g<List<Mount>> mounts = this.this$0.getInventoryRepository().getMounts();
                this.label = 2;
                obj = i.x(mounts, this);
                if (obj == d10) {
                    return d10;
                }
                list = (List) obj;
            }
        }
        if (list == null) {
            list = t.i();
        }
        if (q.d("pets", this.this$0.getItemType$Habitica_2311256681_prodRelease())) {
            ownedMounts = this.this$0.getInventoryRepository().getOwnedPets();
        } else {
            ownedMounts = this.this$0.getInventoryRepository().getOwnedMounts();
        }
        g<Map<String, OwnedObject>> gVar = new g<Map<String, OwnedObject>>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1$2", f = "StableViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r8)
                        goto L6f
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        dc.n.b(r8)
                        dd.h r8 = r6.$this_unsafeFlow
                        java.util.List r7 = (java.util.List) r7
                        java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                        r2.<init>()
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.Iterator r7 = r7.iterator()
                    L43:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L66
                        java.lang.Object r4 = r7.next()
                        io.realm.a1 r4 = (io.realm.a1) r4
                        boolean r5 = r4 instanceof com.habitrpg.android.habitica.models.user.OwnedObject
                        if (r5 == 0) goto L56
                        com.habitrpg.android.habitica.models.user.OwnedObject r4 = (com.habitrpg.android.habitica.models.user.OwnedObject) r4
                        goto L57
                    L56:
                        r4 = 0
                    L57:
                        if (r4 != 0) goto L5a
                        goto L43
                    L5a:
                        java.lang.String r5 = r4.getKey()
                        if (r5 != 0) goto L62
                        java.lang.String r5 = ""
                    L62:
                        r2.put(r5, r4)
                        goto L43
                    L66:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L6f
                        return r1
                    L6f:
                        dc.w r7 = dc.w.f13270a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Map<String, OwnedObject>> hVar, Continuation continuation) {
                Object d11;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d11 = d.d();
                if (collect == d11) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        final StableViewModel stableViewModel = this.this$0;
        h<? super Map<String, OwnedObject>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$loadItems$1.2
            @Override // dd.h
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((Map) obj2, (Continuation<? super w>) continuation);
            }

            public final Object emit(Map<String, OwnedObject> map, Continuation<? super w> continuation) {
                f0 f0Var;
                ArrayList mapAnimals;
                f0Var = StableViewModel.this._items;
                mapAnimals = StableViewModel.this.mapAnimals(list, map);
                f0Var.p(mapAnimals);
                return w.f13270a;
            }
        };
        this.label = 3;
        if (gVar.collect(hVar, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
