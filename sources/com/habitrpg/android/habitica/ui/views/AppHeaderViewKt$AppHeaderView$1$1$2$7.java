package com.habitrpg.android.habitica.ui.views;

import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import j0.n;
import java.util.ArrayList;
import java.util.List;
import pc.q;
import qc.r;
import r.o;
import s.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt$AppHeaderView$1$1$2$7 extends r implements q<r.j, j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ pc.a<w> $onMemberRowClicked;
    final /* synthetic */ List<Member> $teamPlanMembers;
    final /* synthetic */ Avatar $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppHeaderView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$7$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements pc.l<r.f<List<? extends Member>>, o> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppHeaderView.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$7$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends r implements pc.l<Integer, Integer> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            public final Integer invoke(int i10) {
                return Integer.valueOf(i10);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppHeaderView.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$7$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02972 extends r implements pc.l<Integer, Integer> {
            public static final C02972 INSTANCE = new C02972();

            C02972() {
                super(1);
            }

            public final Integer invoke(int i10) {
                return Integer.valueOf(-i10);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ o invoke(r.f<List<? extends Member>> fVar) {
            return invoke2((r.f<List<Member>>) fVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final o invoke2(r.f<List<Member>> fVar) {
            qc.q.i(fVar, "$this$AnimatedContent");
            return new o(r.q.v(s.k.i(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, d0.b(), 2, null), 0.0f, 2, null).b(r.q.O(null, AnonymousClass1.INSTANCE, 1, null)), r.q.x(s.k.i(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6, null), 0.0f, 2, null).c(r.q.T(null, C02972.INSTANCE, 1, null)), 0.0f, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppHeaderView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$7$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends r implements pc.r<r.d, List<? extends Member>, j0.l, Integer, w> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ pc.a<w> $onMemberRowClicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(pc.a<w> aVar, int i10) {
            super(4);
            this.$onMemberRowClicked = aVar;
            this.$$dirty = i10;
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ w invoke(r.d dVar, List<? extends Member> list, j0.l lVar, Integer num) {
            invoke(dVar, list, lVar, num.intValue());
            return w.f13270a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0152, code lost:
        
            r4 = ec.b0.x0(r28, new com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$7$3$invoke$lambda$3$$inlined$sortedByDescending$1());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0161, code lost:
        
            r4 = ec.b0.y0(r4, 6);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r29v0, types: [j0.l, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(r.d r27, java.util.List<? extends com.habitrpg.android.habitica.models.members.Member> r28, j0.l r29, int r30) {
            /*
                Method dump skipped, instructions count: 629
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt$AppHeaderView$1$1$2$7.AnonymousClass3.invoke(r.d, java.util.List, j0.l, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppHeaderViewKt$AppHeaderView$1$1$2$7(List<? extends Member> list, Avatar avatar, pc.a<w> aVar, int i10) {
        super(3);
        this.$teamPlanMembers = list;
        this.$user = avatar;
        this.$onMemberRowClicked = aVar;
        this.$$dirty = i10;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(r.j jVar, j0.l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(r.j jVar, j0.l lVar, int i10) {
        ArrayList arrayList;
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(-791558629, i10, -1, "com.habitrpg.android.habitica.ui.views.AppHeaderView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppHeaderView.kt:240)");
        }
        List<Member> list = this.$teamPlanMembers;
        if (list != null) {
            Avatar avatar = this.$user;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if ((!qc.q.d(((Member) obj).getId(), avatar != null ? avatar.getId() : null)) != false) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        r.b.a(arrayList, null, AnonymousClass2.INSTANCE, null, null, null, q0.c.b(lVar, -1819239086, true, new AnonymousClass3(this.$onMemberRowClicked, this.$$dirty)), lVar, 1573256, 58);
        if (n.K()) {
            n.U();
        }
    }
}
