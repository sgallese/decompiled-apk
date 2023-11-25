package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import dc.w;
import j0.g2;
import j0.n;
import java.util.List;
import qc.q;

/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
public final class GroupPlanMemberListKt {
    public static final void GroupPlanMemberList(List<? extends Member> list, Group group, pc.l<? super String, w> lVar, j0.l lVar2, int i10) {
        q.i(lVar, "onMemberClicked");
        j0.l q10 = lVar2.q(-1307458572);
        if (n.K()) {
            n.V(-1307458572, i10, -1, "com.habitrpg.android.habitica.ui.views.GroupPlanMemberList (GroupPlanMemberList.kt:43)");
        }
        x.b.a(null, null, null, false, null, null, null, false, new GroupPlanMemberListKt$GroupPlanMemberList$1(list, group, lVar, i10), q10, 0, 255);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new GroupPlanMemberListKt$GroupPlanMemberList$2(list, group, lVar, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MemberItem(com.habitrpg.android.habitica.models.members.Member r46, java.lang.String r47, pc.l<? super java.lang.String, dc.w> r48, androidx.compose.ui.e r49, j0.l r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.GroupPlanMemberListKt.MemberItem(com.habitrpg.android.habitica.models.members.Member, java.lang.String, pc.l, androidx.compose.ui.e, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(Member member, j0.l lVar, int i10) {
        int i11;
        int i12;
        j0.l q10 = lVar.q(-1373350168);
        if ((i10 & 14) == 0) {
            if (q10.Q(member)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (n.K()) {
                n.V(-1373350168, i11, -1, "com.habitrpg.android.habitica.ui.views.Preview (GroupPlanMemberList.kt:220)");
            }
            MemberItem(member, "Manager", GroupPlanMemberListKt$Preview$1.INSTANCE, null, q10, Member.$stable | 432 | (i11 & 14), 8);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new GroupPlanMemberListKt$Preview$2(member, i10));
        }
    }
}
