package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import dc.w;
import j0.n;
import java.util.List;
import pc.q;
import qc.r;
import x.x;

/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
final class GroupPlanMemberListKt$GroupPlanMemberList$1 extends r implements pc.l<x, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Group $group;
    final /* synthetic */ List<Member> $members;
    final /* synthetic */ pc.l<String, w> $onMemberClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GroupPlanMemberList.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements q<x.d, j0.l, Integer, w> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Group $group;
        final /* synthetic */ Member $member;
        final /* synthetic */ pc.l<String, w> $onMemberClicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Group group, Member member, pc.l<? super String, w> lVar, int i10) {
            super(3);
            this.$group = group;
            this.$member = member;
            this.$onMemberClicked = lVar;
            this.$$dirty = i10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ w invoke(x.d dVar, j0.l lVar, Integer num) {
            invoke(dVar, lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(x.d dVar, j0.l lVar, int i10) {
            String a10;
            qc.q.i(dVar, "$this$item");
            if ((i10 & 81) == 16 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(860216830, i10, -1, "com.habitrpg.android.habitica.ui.views.GroupPlanMemberList.<anonymous>.<anonymous> (GroupPlanMemberList.kt:62)");
            }
            Group group = this.$group;
            if (group != null && group.isLeader(this.$member.getId())) {
                lVar.e(-802611942);
                a10 = s1.h.a(R.string.owner, lVar, 6);
                lVar.N();
            } else {
                Group group2 = this.$group;
                if (group2 != null && group2.isManager(this.$member.getId())) {
                    lVar.e(-802611825);
                    a10 = s1.h.a(R.string.manager, lVar, 6);
                    lVar.N();
                } else {
                    lVar.e(-802611747);
                    a10 = s1.h.a(R.string.member, lVar, 6);
                    lVar.N();
                }
            }
            GroupPlanMemberListKt.MemberItem(this.$member, a10, this.$onMemberClicked, androidx.compose.foundation.layout.j.j(androidx.compose.ui.e.f2335a, j2.h.j(8), j2.h.j(4)), lVar, Member.$stable | 3072 | (this.$$dirty & 896), 0);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupPlanMemberListKt$GroupPlanMemberList$1(List<? extends Member> list, Group group, pc.l<? super String, w> lVar, int i10) {
        super(1);
        this.$members = list;
        this.$group = group;
        this.$onMemberClicked = lVar;
        this.$$dirty = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(x xVar) {
        invoke2(xVar);
        return w.f13270a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        r0 = ec.b0.x0(r0, new com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1$invoke$$inlined$sortedByDescending$1());
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(x.x r9) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$LazyColumn"
            qc.q.i(r9, r0)
            r2 = 0
            r3 = 0
            com.habitrpg.android.habitica.ui.views.ComposableSingletons$GroupPlanMemberListKt r0 = com.habitrpg.android.habitica.ui.views.ComposableSingletons$GroupPlanMemberListKt.INSTANCE
            pc.q r4 = r0.m150getLambda1$Habitica_2311256681_prodRelease()
            r5 = 3
            r6 = 0
            r1 = r9
            x.w.a(r1, r2, r3, r4, r5, r6)
            java.util.List<com.habitrpg.android.habitica.models.members.Member> r0 = r8.$members
            if (r0 == 0) goto L24
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1$invoke$$inlined$sortedByDescending$1 r1 = new com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1$invoke$$inlined$sortedByDescending$1
            r1.<init>()
            java.util.List r0 = ec.r.x0(r0, r1)
            if (r0 != 0) goto L28
        L24:
            java.util.List r0 = ec.r.i()
        L28:
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            com.habitrpg.android.habitica.models.members.Member r1 = (com.habitrpg.android.habitica.models.members.Member) r1
            r3 = 0
            r4 = 0
            com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1$2 r2 = new com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1$2
            com.habitrpg.android.habitica.models.social.Group r5 = r8.$group
            pc.l<java.lang.String, dc.w> r6 = r8.$onMemberClicked
            int r7 = r8.$$dirty
            r2.<init>(r5, r1, r6, r7)
            r1 = 860216830(0x3345ddfe, float:4.6069538E-8)
            r5 = 1
            q0.a r5 = q0.c.c(r1, r5, r2)
            r6 = 3
            r7 = 0
            r2 = r9
            x.w.a(r2, r3, r4, r5, r6, r7)
            goto L2c
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt$GroupPlanMemberList$1.invoke2(x.x):void");
    }
}
