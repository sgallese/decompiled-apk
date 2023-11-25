package com.habitrpg.android.habitica.data.implementation;

import android.content.Context;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.local.ContentLocalRepository;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import dd.g;
import qc.q;

/* compiled from: ContentRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class ContentRepositoryImpl<T extends ContentLocalRepository> extends BaseRepositoryImpl<T> implements ContentRepository {
    public static final int $stable = 8;
    private long lastContentSync;
    private long lastWorldStateSync;
    private final SpecialItem mysteryItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentRepositoryImpl(T t10, ApiClient apiClient, Context context, AuthenticationHandler authenticationHandler) {
        super(t10, apiClient, authenticationHandler);
        q.i(t10, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(context, "context");
        q.i(authenticationHandler, "authenticationHandler");
        this.mysteryItem = SpecialItem.Companion.makeMysteryItem(context);
    }

    @Override // com.habitrpg.android.habitica.data.ContentRepository
    public g<WorldState> getWorldState() {
        return ((ContentLocalRepository) getLocalRepository()).getWorldState();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // com.habitrpg.android.habitica.data.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveContent(boolean r10, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.ContentResult> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveContent$1
            if (r0 == 0) goto L13
            r0 = r11
            com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveContent$1 r0 = (com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveContent$1 r0 = new com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveContent$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.J$0
            java.lang.Object r10 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl r10 = (com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl) r10
            dc.n.b(r11)
            goto L66
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            dc.n.b(r11)
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            long r5 = r11.getTime()
            if (r10 != 0) goto L53
            long r10 = r9.lastContentSync
            long r10 = r5 - r10
            r7 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 <= 0) goto L52
            goto L53
        L52:
            return r4
        L53:
            com.habitrpg.android.habitica.data.ApiClient r10 = r9.getApiClient()
            r0.L$0 = r9
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r11 = com.habitrpg.android.habitica.data.ApiClient.DefaultImpls.getContent$default(r10, r4, r0, r3, r4)
            if (r11 != r1) goto L64
            return r1
        L64:
            r10 = r9
            r1 = r5
        L66:
            com.habitrpg.android.habitica.models.ContentResult r11 = (com.habitrpg.android.habitica.models.ContentResult) r11
            if (r11 != 0) goto L6b
            return r4
        L6b:
            r10.lastContentSync = r1
            io.realm.x0 r0 = new io.realm.x0
            r0.<init>()
            r11.setSpecial(r0)
            io.realm.x0 r0 = r11.getSpecial()
            com.habitrpg.android.habitica.models.inventory.SpecialItem r1 = r10.mysteryItem
            r0.add(r1)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r10 = r10.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ContentLocalRepository r10 = (com.habitrpg.android.habitica.data.local.ContentLocalRepository) r10
            r10.saveContent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl.retrieveContent(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // com.habitrpg.android.habitica.data.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveWorldState(boolean r10, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.WorldState> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveWorldState$1
            if (r0 == 0) goto L13
            r0 = r11
            com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveWorldState$1 r0 = (com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveWorldState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveWorldState$1 r0 = new com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl$retrieveWorldState$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            long r1 = r0.J$0
            java.lang.Object r10 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl r10 = (com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl) r10
            dc.n.b(r11)
            goto L66
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            dc.n.b(r11)
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            long r5 = r11.getTime()
            if (r10 != 0) goto L53
            long r10 = r9.lastWorldStateSync
            long r10 = r5 - r10
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 <= 0) goto L52
            goto L53
        L52:
            return r3
        L53:
            com.habitrpg.android.habitica.data.ApiClient r10 = r9.getApiClient()
            r0.L$0 = r9
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r11 = r10.getWorldState(r0)
            if (r11 != r1) goto L64
            return r1
        L64:
            r10 = r9
            r1 = r5
        L66:
            com.habitrpg.android.habitica.models.WorldState r11 = (com.habitrpg.android.habitica.models.WorldState) r11
            if (r11 != 0) goto L6b
            return r3
        L6b:
            r10.lastWorldStateSync = r1
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r10 = r10.getLocalRepository()
            com.habitrpg.android.habitica.data.local.ContentLocalRepository r10 = (com.habitrpg.android.habitica.data.local.ContentLocalRepository) r10
            r10.save(r11)
            io.realm.x0 r10 = r11.getEvents()
            java.util.Iterator r10 = r10.iterator()
        L7e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r10.next()
            com.habitrpg.android.habitica.models.WorldStateEvent r0 = (com.habitrpg.android.habitica.models.WorldStateEvent) r0
            java.lang.String r1 = r0.getAprilFools()
            if (r1 == 0) goto L7e
            boolean r1 = r0.isCurrentlyActive()
            if (r1 == 0) goto L7e
            com.habitrpg.android.habitica.helpers.AprilFoolsHandler$Companion r1 = com.habitrpg.android.habitica.helpers.AprilFoolsHandler.Companion
            java.lang.String r2 = r0.getAprilFools()
            java.util.Date r0 = r0.getEnd()
            r1.handle(r2, r0)
            goto L7e
        La4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl.retrieveWorldState(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
