package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import com.habitrpg.android.habitica.models.CustomizationFilter;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.ui.adapter.CustomizationRecyclerViewAdapter;
import dc.n;
import dc.w;
import dd.x;
import ec.b0;
import ec.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;
import pc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AvatarCustomizationFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$1", f = "AvatarCustomizationFragment.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AvatarCustomizationFragment$loadCustomizations$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ AvatarCustomizationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarCustomizationFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$1$1", f = "AvatarCustomizationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements q<List<? extends Customization>, CustomizationFilter, Continuation<? super dc.l<? extends List<? extends Customization>, ? extends CustomizationFilter>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Customization> list, CustomizationFilter customizationFilter, Continuation<? super dc.l<? extends List<? extends Customization>, ? extends CustomizationFilter>> continuation) {
            return invoke2(list, customizationFilter, (Continuation<? super dc.l<? extends List<? extends Customization>, CustomizationFilter>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                return new dc.l((List) this.L$0, (CustomizationFilter) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<? extends Customization> list, CustomizationFilter customizationFilter, Continuation<? super dc.l<? extends List<? extends Customization>, CustomizationFilter>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = customizationFilter;
            return anonymousClass1.invokeSuspend(w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarCustomizationFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$1$2", f = "AvatarCustomizationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements q<dc.l<? extends List<? extends Customization>, ? extends CustomizationFilter>, List<? extends OwnedCustomization>, Continuation<? super dc.q<? extends List<? extends Customization>, ? extends CustomizationFilter, ? extends List<? extends OwnedCustomization>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(dc.l<? extends List<? extends Customization>, CustomizationFilter> lVar, List<? extends OwnedCustomization> list, Continuation<? super dc.q<? extends List<? extends Customization>, CustomizationFilter, ? extends List<? extends OwnedCustomization>>> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = lVar;
            anonymousClass2.L$1 = list;
            return anonymousClass2.invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                dc.l lVar = (dc.l) this.L$0;
                return new dc.q(lVar.c(), lVar.d(), (List) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(dc.l<? extends List<? extends Customization>, ? extends CustomizationFilter> lVar, List<? extends OwnedCustomization> list, Continuation<? super dc.q<? extends List<? extends Customization>, ? extends CustomizationFilter, ? extends List<? extends OwnedCustomization>>> continuation) {
            return invoke2((dc.l<? extends List<? extends Customization>, CustomizationFilter>) lVar, list, (Continuation<? super dc.q<? extends List<? extends Customization>, CustomizationFilter, ? extends List<? extends OwnedCustomization>>>) continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationFragment$loadCustomizations$1(AvatarCustomizationFragment avatarCustomizationFragment, String str, Continuation<? super AvatarCustomizationFragment$loadCustomizations$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarCustomizationFragment;
        this.$type = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarCustomizationFragment$loadCustomizations$1(this.this$0, this.$type, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarCustomizationFragment$loadCustomizations$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        x xVar;
        x xVar2;
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
            dd.g<List<Customization>> customizations = this.this$0.getCustomizationRepository().getCustomizations(this.$type, this.this$0.getCategory(), false);
            xVar = this.this$0.currentFilter;
            dd.g A = dd.i.A(customizations, xVar, new AnonymousClass1(null));
            xVar2 = this.this$0.ownedCustomizations;
            dd.g A2 = dd.i.A(A, xVar2, new AnonymousClass2(null));
            final AvatarCustomizationFragment avatarCustomizationFragment = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$1.3
                public final Object emit(dc.q<? extends List<? extends Customization>, CustomizationFilter, ? extends List<? extends OwnedCustomization>> qVar, Continuation<? super w> continuation) {
                    int s10;
                    boolean shouldSkip;
                    List<? extends Customization> a10 = qVar.a();
                    CustomizationFilter b10 = qVar.b();
                    List<? extends OwnedCustomization> c10 = qVar.c();
                    CustomizationRecyclerViewAdapter adapter$Habitica_2311256681_prodRelease = AvatarCustomizationFragment.this.getAdapter$Habitica_2311256681_prodRelease();
                    List<? extends OwnedCustomization> list = c10;
                    s10 = u.s(list, 10);
                    ArrayList arrayList = new ArrayList(s10);
                    for (OwnedCustomization ownedCustomization : list) {
                        arrayList.add(ownedCustomization.getKey() + "_" + ownedCustomization.getType() + "_" + ownedCustomization.getCategory());
                    }
                    adapter$Habitica_2311256681_prodRelease.setOwnedCustomizations(arrayList);
                    if (b10.isFiltering()) {
                        List<? extends Customization> arrayList2 = new ArrayList<>();
                        for (Customization customization : a10) {
                            shouldSkip = AvatarCustomizationFragment.this.shouldSkip(b10, c10, customization);
                            if (!shouldSkip) {
                                arrayList2.add(customization);
                            }
                        }
                        CustomizationRecyclerViewAdapter adapter$Habitica_2311256681_prodRelease2 = AvatarCustomizationFragment.this.getAdapter$Habitica_2311256681_prodRelease();
                        if (!b10.getAscending()) {
                            arrayList2 = b0.t0(arrayList2);
                        }
                        adapter$Habitica_2311256681_prodRelease2.setCustomizations(arrayList2);
                    } else {
                        CustomizationRecyclerViewAdapter adapter$Habitica_2311256681_prodRelease3 = AvatarCustomizationFragment.this.getAdapter$Habitica_2311256681_prodRelease();
                        if (!b10.getAscending()) {
                            a10 = b0.t0(a10);
                        }
                        adapter$Habitica_2311256681_prodRelease3.setCustomizations(a10);
                    }
                    return w.f13270a;
                }

                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((dc.q) obj2, (Continuation<? super w>) continuation);
                }
            };
            this.label = 1;
            if (A2.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
