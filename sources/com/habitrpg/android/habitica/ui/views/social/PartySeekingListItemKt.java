package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.models.members.Member;
import j0.g2;
import j0.n;

/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
public final class PartySeekingListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PartySeekingListItem(com.habitrpg.android.habitica.models.members.Member r74, androidx.compose.ui.e r75, com.habitrpg.android.habitica.ui.views.LoadingButtonState r76, boolean r77, boolean r78, boolean r79, pc.l<? super com.habitrpg.android.habitica.models.members.Member, dc.w> r80, j0.l r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.social.PartySeekingListItemKt.PartySeekingListItem(com.habitrpg.android.habitica.models.members.Member, androidx.compose.ui.e, com.habitrpg.android.habitica.ui.views.LoadingButtonState, boolean, boolean, boolean, pc.l, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(Member member, j0.l lVar, int i10) {
        int i11;
        int i12;
        j0.l q10 = lVar.q(-967030284);
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
                n.V(-967030284, i11, -1, "com.habitrpg.android.habitica.ui.views.social.Preview (PartySeekingListItem.kt:206)");
            }
            PartySeekingListItem(member, null, null, false, false, false, PartySeekingListItemKt$Preview$1.INSTANCE, q10, 1572864 | Member.$stable | (i11 & 14), 62);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new PartySeekingListItemKt$Preview$2(member, i10));
        }
    }
}
