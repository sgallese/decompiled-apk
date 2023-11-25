package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.paging.u1;
import androidx.paging.w1;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;

/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingPagingSource extends u1<Integer, Member> {
    public static final int $stable = 8;
    private final SocialRepository repository;

    public PartySeekingPagingSource(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "repository");
        this.repository = socialRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:12:0x0028, B:24:0x0052, B:26:0x0058, B:33:0x006b, B:38:0x0079, B:37:0x0074, B:31:0x0063, B:17:0x0037, B:19:0x003f, B:21:0x0045), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:12:0x0028, B:24:0x0052, B:26:0x0058, B:33:0x006b, B:38:0x0079, B:37:0x0074, B:31:0x0063, B:17:0x0037, B:19:0x003f, B:21:0x0045), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:12:0x0028, B:24:0x0052, B:26:0x0058, B:33:0x006b, B:38:0x0079, B:37:0x0074, B:31:0x0063, B:17:0x0037, B:19:0x003f, B:21:0x0045), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:12:0x0028, B:24:0x0052, B:26:0x0058, B:33:0x006b, B:38:0x0079, B:37:0x0074, B:31:0x0063, B:17:0x0037, B:19:0x003f, B:21:0x0045), top: B:43:0x0022 }] */
    @Override // androidx.paging.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.u1.a<java.lang.Integer> r7, kotlin.coroutines.Continuation<? super androidx.paging.u1.b<java.lang.Integer, com.habitrpg.android.habitica.models.members.Member>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource$load$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource$load$1 r0 = (com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource$load$1 r0 = new com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource$load$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            int r7 = r0.I$0
            dc.n.b(r8)     // Catch: java.lang.Exception -> L7d
            goto L52
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            dc.n.b(r8)
            java.lang.Object r7 = r7.a()     // Catch: java.lang.Exception -> L7d
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L7d
            if (r7 == 0) goto L44
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L7d
            goto L45
        L44:
            r7 = 0
        L45:
            com.habitrpg.android.habitica.data.SocialRepository r8 = r6.repository     // Catch: java.lang.Exception -> L7d
            r0.I$0 = r7     // Catch: java.lang.Exception -> L7d
            r0.label = r4     // Catch: java.lang.Exception -> L7d
            java.lang.Object r8 = r8.retrievePartySeekingUsers(r7, r0)     // Catch: java.lang.Exception -> L7d
            if (r8 != r1) goto L52
            return r1
        L52:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L7d
            androidx.paging.u1$b$b r0 = new androidx.paging.u1$b$b     // Catch: java.lang.Exception -> L7d
            if (r8 != 0) goto L5d
            java.util.List r1 = ec.r.i()     // Catch: java.lang.Exception -> L7d
            goto L5e
        L5d:
            r1 = r8
        L5e:
            r2 = 0
            if (r7 != 0) goto L63
            r5 = r2
            goto L69
        L63:
            int r5 = r7 + (-1)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.d(r5)     // Catch: java.lang.Exception -> L7d
        L69:
            if (r8 == 0) goto L6f
            int r3 = r8.size()     // Catch: java.lang.Exception -> L7d
        L6f:
            r8 = 30
            if (r3 >= r8) goto L74
            goto L79
        L74:
            int r7 = r7 + r4
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.d(r7)     // Catch: java.lang.Exception -> L7d
        L79:
            r0.<init>(r1, r5, r2)     // Catch: java.lang.Exception -> L7d
            goto L83
        L7d:
            r7 = move-exception
            androidx.paging.u1$b$a r0 = new androidx.paging.u1$b$a
            r0.<init>(r7)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource.load(androidx.paging.u1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.u1
    public Integer getRefreshKey(w1<Integer, Member> w1Var) {
        Integer i10;
        Integer valueOf;
        Integer j10;
        qc.q.i(w1Var, "state");
        Integer d10 = w1Var.d();
        if (d10 != null) {
            int intValue = d10.intValue();
            u1.b.C0145b<Integer, Member> c10 = w1Var.c(intValue);
            if (c10 == null || (j10 = c10.j()) == null) {
                u1.b.C0145b<Integer, Member> c11 = w1Var.c(intValue);
                if (c11 == null || (i10 = c11.i()) == null) {
                    return null;
                }
                valueOf = Integer.valueOf(i10.intValue() - 1);
            } else {
                valueOf = Integer.valueOf(j10.intValue() + 1);
            }
            return valueOf;
        }
        return null;
    }
}
