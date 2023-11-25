package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.local.TagLocalRepository;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dd.g;
import dd.i;
import java.util.List;
import qc.q;

/* compiled from: TagRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class TagRepositoryImpl extends BaseRepositoryImpl<TagLocalRepository> implements TagRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagRepositoryImpl(TagLocalRepository tagLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        super(tagLocalRepository, apiClient, authenticationHandler);
        q.i(tagLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.habitrpg.android.habitica.data.TagRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createTag(com.habitrpg.android.habitica.models.Tag r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.Tag> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTag$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTag$1 r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTag$1 r0 = new com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTag$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl r5 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl) r5
            dc.n.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.createTag(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            com.habitrpg.android.habitica.models.Tag r6 = (com.habitrpg.android.habitica.models.Tag) r6
            if (r6 != 0) goto L4e
            r5 = 0
            return r5
        L4e:
            java.lang.String r0 = r5.getCurrentUserID()
            r6.setUserId(r0)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TagLocalRepository r5 = (com.habitrpg.android.habitica.data.local.TagLocalRepository) r5
            r5.save(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl.createTag(com.habitrpg.android.habitica.models.Tag, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.data.TagRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createTags(java.util.Collection<? extends com.habitrpg.android.habitica.models.Tag> r6, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.Tag>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTags$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTags$1 r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTags$1 r0 = new com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$createTags$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$1
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl r4 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl) r4
            dc.n.b(r7)
            goto L68
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            dc.n.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r5
            r2 = r7
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()
            com.habitrpg.android.habitica.models.Tag r7 = (com.habitrpg.android.habitica.models.Tag) r7
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.createTag(r7, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            com.habitrpg.android.habitica.models.Tag r7 = (com.habitrpg.android.habitica.models.Tag) r7
            if (r7 == 0) goto L4d
            r2.add(r7)
            goto L4d
        L70:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl.createTags(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.TagRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteTag(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.Void> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTag$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTag$1 r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTag$1 r0 = new com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTag$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl) r0
            dc.n.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.deleteTag(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TagLocalRepository r6 = (com.habitrpg.android.habitica.data.local.TagLocalRepository) r6
            r6.deleteTag(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl.deleteTag(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.data.TagRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteTags(java.util.Collection<java.lang.String> r6, kotlin.coroutines.Continuation<? super java.util.List<java.lang.Void>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTags$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTags$1 r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTags$1 r0 = new com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$deleteTags$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$1
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl r4 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl) r4
            dc.n.b(r7)
            goto L68
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            dc.n.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r5
            r2 = r7
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.deleteTag(r7, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            java.lang.Void r7 = (java.lang.Void) r7
            if (r7 == 0) goto L4d
            r2.add(r7)
            goto L4d
        L70:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl.deleteTags(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TagRepository
    public g<List<Tag>> getTags() {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new TagRepositoryImpl$getTags$$inlined$flatMapLatest$1(null, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // com.habitrpg.android.habitica.data.TagRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateTag(com.habitrpg.android.habitica.models.Tag r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.Tag> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTag$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTag$1 r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTag$1 r0 = new com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTag$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl r5 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl) r5
            dc.n.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            java.lang.String r2 = r5.getId()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.updateTag(r2, r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            com.habitrpg.android.habitica.models.Tag r6 = (com.habitrpg.android.habitica.models.Tag) r6
            if (r6 != 0) goto L52
            r5 = 0
            return r5
        L52:
            java.lang.String r0 = r5.getCurrentUserID()
            r6.setUserId(r0)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TagLocalRepository r5 = (com.habitrpg.android.habitica.data.local.TagLocalRepository) r5
            r5.save(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl.updateTag(com.habitrpg.android.habitica.models.Tag, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.data.TagRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateTags(java.util.Collection<? extends com.habitrpg.android.habitica.models.Tag> r6, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.Tag>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTags$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTags$1 r0 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTags$1 r0 = new com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl$updateTags$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$1
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl r4 = (com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl) r4
            dc.n.b(r7)
            goto L68
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            dc.n.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r5
            r2 = r7
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()
            com.habitrpg.android.habitica.models.Tag r7 = (com.habitrpg.android.habitica.models.Tag) r7
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.updateTag(r7, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            com.habitrpg.android.habitica.models.Tag r7 = (com.habitrpg.android.habitica.models.Tag) r7
            if (r7 == 0) goto L4d
            r2.add(r7)
            goto L4d
        L70:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl.updateTags(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TagRepository
    public g<List<Tag>> getTags(String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        return getLocalRepository().getTags(str);
    }
}
