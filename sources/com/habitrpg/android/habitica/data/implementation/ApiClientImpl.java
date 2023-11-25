package com.habitrpg.android.habitica.data.implementation;

import android.content.Context;
import com.google.android.gms.common.Scopes;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.api.GSonFactoryCreator;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.LeaveChallengeBody;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.invitations.InviteResponse;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.responses.BulkTaskScoringData;
import com.habitrpg.android.habitica.models.responses.BuyResponse;
import com.habitrpg.android.habitica.models.responses.PostChatMessageResult;
import com.habitrpg.android.habitica.models.responses.SkillResponse;
import com.habitrpg.android.habitica.models.responses.UnlockResponse;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.api.Server;
import com.habitrpg.common.habitica.models.HabitResponse;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.PurchaseValidationRequest;
import com.habitrpg.common.habitica.models.PurchaseValidationResult;
import com.habitrpg.common.habitica.models.auth.UserAuth;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import com.habitrpg.common.habitica.models.auth.UserAuthSocial;
import com.habitrpg.common.habitica.models.auth.UserAuthSocialTokens;
import com.habitrpg.shared.habitica.models.responses.ErrorResponse;
import com.habitrpg.shared.habitica.models.responses.Status;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse;
import dc.w;
import ic.d;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import qc.h;
import qc.q;
import retrofit2.Converter;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yc.v;

/* compiled from: ApiClientImpl.kt */
/* loaded from: classes4.dex */
public final class ApiClientImpl implements ApiClient {
    private ApiService apiService;
    private final Context context;
    private final Converter.Factory converter;
    private int erroredRequestCount;
    private final HostConfig hostConfig;
    private String languageCode;
    private String lastAPICallURL;
    private final Date lastPurchaseValidation;
    private final Date lastSubscribeCall;
    private final NotificationsManager notificationsManager;
    private Retrofit retrofitAdapter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ApiClientImpl.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final GsonConverterFactory createGsonFactory() {
            GsonConverterFactory create = GSonFactoryCreator.create();
            q.h(create, "create(...)");
            return create;
        }
    }

    public ApiClientImpl(Converter.Factory factory, HostConfig hostConfig, NotificationsManager notificationsManager, Context context) {
        q.i(factory, "converter");
        q.i(hostConfig, "hostConfig");
        q.i(notificationsManager, "notificationsManager");
        q.i(context, "context");
        this.converter = factory;
        this.hostConfig = hostConfig;
        this.notificationsManager = notificationsManager;
        this.context = context;
        buildRetrofit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [okhttp3.logging.HttpLoggingInterceptor$Logger, qc.h] */
    /* JADX WARN: Type inference failed for: r2v1 */
    private final void buildRetrofit() {
        Retrofit retrofit = 0;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(retrofit, 1, retrofit);
        final String property = System.getProperty("http.agent");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        final long j10 = -TimeUnit.MINUTES.convert(gregorianCalendar.getTimeZone().getOffset(gregorianCalendar.getTimeInMillis()), TimeUnit.MILLISECONDS);
        Retrofit build = new Retrofit.Builder().client(new OkHttpClient.Builder().cache(new Cache(new File(this.context.getCacheDir(), "http_cache"), 10485760L)).addNetworkInterceptor(new Interceptor() { // from class: com.habitrpg.android.habitica.data.implementation.ApiClientImpl$buildRetrofit$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                boolean z10;
                q.i(chain, "chain");
                Request request = chain.request();
                Request.Builder newBuilder = request.newBuilder();
                if (ApiClientImpl.this.getHostConfig().hasAuthentication()) {
                    newBuilder = newBuilder.header("x-api-key", ApiClientImpl.this.getHostConfig().getApiKey()).header("x-api-user", ApiClientImpl.this.getHostConfig().getUserID());
                }
                Request.Builder header = newBuilder.header("x-client", "habitica-android").header("x-user-timezoneOffset", String.valueOf(j10));
                String str = property;
                if (str != null) {
                    q.f(str);
                    header = header.header("user-agent", property);
                }
                boolean z11 = true;
                if ("".length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    header = header.header("Authorization", "Basic ");
                }
                Request build2 = header.method(request.method(), request.body()).build();
                ApiClientImpl.this.lastAPICallURL = request.url().toString();
                Response proceed = chain.proceed(build2);
                if (proceed.isSuccessful()) {
                    ApiClientImpl.this.hideConnectionProblemDialog();
                    return proceed;
                }
                int code = proceed.code();
                if (400 > code || code >= 600) {
                    z11 = false;
                }
                if (z11 && proceed.code() != 404) {
                    return proceed.newBuilder().header("Cache-Control", "no-store").build();
                }
                return proceed;
            }
        }).addInterceptor(httpLoggingInterceptor).readTimeout(2400L, TimeUnit.SECONDS).build()).baseUrl(new Server(getHostConfig().getAddress()).toString()).addConverterFactory(this.converter).build();
        q.h(build, "build(...)");
        this.retrofitAdapter = build;
        if (build == null) {
            q.z("retrofitAdapter");
        } else {
            retrofit = build;
        }
        Object create = retrofit.create(ApiService.class);
        q.h(create, "create(...)");
        this.apiService = (ApiService) create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideConnectionProblemDialog() {
        HabiticaBaseApplication habiticaBaseApplication;
        WeakReference<BaseActivity> currentActivity;
        BaseActivity baseActivity;
        if (this.erroredRequestCount == 0) {
            return;
        }
        this.erroredRequestCount = 0;
        Context context = this.context;
        HabiticaBaseApplication habiticaBaseApplication2 = null;
        if (context instanceof HabiticaBaseApplication) {
            habiticaBaseApplication = (HabiticaBaseApplication) context;
        } else {
            habiticaBaseApplication = null;
        }
        if (habiticaBaseApplication == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof HabiticaBaseApplication) {
                habiticaBaseApplication2 = (HabiticaBaseApplication) applicationContext;
            }
        } else {
            habiticaBaseApplication2 = habiticaBaseApplication;
        }
        if (habiticaBaseApplication2 != null && (currentActivity = habiticaBaseApplication2.getCurrentActivity()) != null && (baseActivity = currentActivity.get()) != null) {
            baseActivity.hideConnectionProblem();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object process(pc.l<? super kotlin.coroutines.Continuation<? super com.habitrpg.common.habitica.models.HabitResponse<T>>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$process$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$process$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$process$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$process$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$process$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r0
            dc.n.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L4d
        L31:
            r5 = move-exception
            goto L56
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            dc.n.b(r6)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L54
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L54
            r0.label = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L54
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
            r0 = r5
        L4d:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.processResponse(r6)     // Catch: java.lang.Throwable -> L31
            return r5
        L54:
            r5 = move-exception
            r0 = r4
        L56:
            r0.accept(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.process(pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final <T> T processResponse(HabitResponse<T> habitResponse) {
        List<Notification> notifications = habitResponse.getNotifications();
        if (notifications != null) {
            this.notificationsManager.setNotifications(notifications);
        }
        return habitResponse.getData();
    }

    private final void showConnectionProblemDialog(int i10) {
        String string = this.context.getString(i10);
        q.h(string, "getString(...)");
        showConnectionProblemDialog((String) null, string);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object abortQuest(String str, Continuation<? super Quest> continuation) {
        return process(new ApiClientImpl$abortQuest$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.accept(java.lang.Throwable):void");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object acceptQuest(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$acceptQuest$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object addPushDevice(Map<String, String> map, Continuation<? super List<Void>> continuation) {
        return process(new ApiClientImpl$addPushDevice$2(this, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object allocatePoint(String str, Continuation<? super Stats> continuation) {
        return process(new ApiClientImpl$allocatePoint$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object assignToTask(String str, List<String> list, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$assignToTask$2(this, str, list, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object blockMember(String str, Continuation<? super List<String>> continuation) {
        return process(new ApiClientImpl$blockMember$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object bulkAllocatePoints(int i10, int i11, int i12, int i13, Continuation<? super Stats> continuation) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("str", b.d(i10));
        hashMap2.put("int", b.d(i11));
        hashMap2.put("con", b.d(i12));
        hashMap2.put("per", b.d(i13));
        hashMap.put(NavigationDrawerFragment.SIDEBAR_STATS, hashMap2);
        return process(new ApiClientImpl$bulkAllocatePoints$2(this, hashMap, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object bulkScoreTasks(List<? extends Map<String, String>> list, Continuation<? super BulkTaskScoringData> continuation) {
        return process(new ApiClientImpl$bulkScoreTasks$2(this, list, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object buyItem(String str, int i10, Continuation<? super BuyResponse> continuation) {
        return process(new ApiClientImpl$buyItem$2(this, str, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object cancelQuest(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$cancelQuest$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object cancelSubscription(kotlin.coroutines.Continuation<? super java.lang.Void> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$cancelSubscription$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$cancelSubscription$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$cancelSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$cancelSubscription$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$cancelSubscription$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r0
            dc.n.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            com.habitrpg.android.habitica.api.ApiService r5 = r4.apiService
            if (r5 != 0) goto L42
            java.lang.String r5 = "apiService"
            qc.q.z(r5)
            r5 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.cancelSubscription(r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r5 = (com.habitrpg.common.habitica.models.HabitResponse) r5
            java.lang.Object r5 = r0.processResponse(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.cancelSubscription(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object changeClass(String str, Continuation<? super User> continuation) {
        return process(new ApiClientImpl$changeClass$2(str, this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object changeCustomDayStart(Map<String, ? extends Object> map, Continuation<? super User> continuation) {
        return process(new ApiClientImpl$changeCustomDayStart$2(this, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object connectSocial(String str, String str2, String str3, Continuation<? super UserAuthResponse> continuation) {
        UserAuthSocial userAuthSocial = new UserAuthSocial();
        userAuthSocial.setNetwork(str);
        UserAuthSocialTokens userAuthSocialTokens = new UserAuthSocialTokens();
        userAuthSocialTokens.setClient_id(str2);
        userAuthSocialTokens.setAccess_token(str3);
        userAuthSocial.setAuthResponse(userAuthSocialTokens);
        return process(new ApiClientImpl$connectSocial$2(this, userAuthSocial, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object connectUser(String str, String str2, Continuation<? super UserAuthResponse> continuation) {
        UserAuth userAuth = new UserAuth(null, null, null, null, 15, null);
        userAuth.setUsername(str);
        userAuth.setPassword(str2);
        return process(new ApiClientImpl$connectUser$2(this, userAuth, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createChallenge(Challenge challenge, Continuation<? super Challenge> continuation) {
        return process(new ApiClientImpl$createChallenge$2(this, challenge, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createChallengeTask(String str, Task task, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$createChallengeTask$2(this, str, task, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createChallengeTasks(String str, List<? extends Task> list, Continuation<? super List<? extends Task>> continuation) {
        return process(new ApiClientImpl$createChallengeTasks$2(this, str, list, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createGroup(com.habitrpg.android.habitica.models.social.Group r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createGroup$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createGroup$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.createGroup(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.createGroup(com.habitrpg.android.habitica.models.social.Group, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createGroupTask(String str, Task task, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$createGroupTask$2(this, str, task, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createTag(Tag tag, Continuation<? super Tag> continuation) {
        return process(new ApiClientImpl$createTag$2(this, tag, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createTask(Task task, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$createTask$2(this, task, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object createTasks(List<? extends Task> list, Continuation<? super List<? extends Task>> continuation) {
        return process(new ApiClientImpl$createTasks$2(this, list, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object debugAddTenGems(Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$debugAddTenGems$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deleteAccount(String str, Continuation<? super Void> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put("password", str);
        return process(new ApiClientImpl$deleteAccount$2(this, hashMap, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deleteChallenge(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$deleteChallenge$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deleteInboxMessage(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$deleteInboxMessage$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deleteMessage(String str, String str2, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$deleteMessage$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deletePushDevice(String str, Continuation<? super List<Void>> continuation) {
        return process(new ApiClientImpl$deletePushDevice$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deleteTag(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$deleteTag$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object deleteTask(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$deleteTask$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object disableClasses(Continuation<? super User> continuation) {
        return process(new ApiClientImpl$disableClasses$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object disconnectSocial(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$disconnectSocial$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object equipItem(String str, String str2, Continuation<? super Items> continuation) {
        return process(new ApiClientImpl$equipItem$2(this, str, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[PHI: r9
      0x0078: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v1 java.lang.Object) binds: [B:28:0x0075, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object feedPet(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.FeedResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            dc.n.b(r9)
            goto L78
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r7 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r7
            dc.n.b(r9)
            goto L56
        L3d:
            dc.n.b(r9)
            com.habitrpg.android.habitica.api.ApiService r9 = r6.apiService
            if (r9 != 0) goto L4a
            java.lang.String r9 = "apiService"
            qc.q.z(r9)
            r9 = r5
        L4a:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r9 = r9.feedPet(r7, r8, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r7 = r6
        L56:
            com.habitrpg.common.habitica.models.HabitResponse r9 = (com.habitrpg.common.habitica.models.HabitResponse) r9
            java.lang.Object r8 = r9.getData()
            com.habitrpg.shared.habitica.models.responses.FeedResponse r8 = (com.habitrpg.shared.habitica.models.responses.FeedResponse) r8
            if (r8 != 0) goto L61
            goto L68
        L61:
            java.lang.String r2 = r9.getMessage()
            r8.setMessage(r2)
        L68:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$2 r8 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$2
            r8.<init>(r9, r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r9 = r7.process(r8, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.feedPet(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object findUsernames(String str, String str2, String str3, Continuation<? super List<FindUsernameResult>> continuation) {
        return process(new ApiClientImpl$findUsernames$2(this, str, str2, str3, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object flagInboxMessage(String str, Map<String, String> map, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$flagInboxMessage$2(this, str, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object flagMessage(String str, String str2, Map<String, String> map, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$flagMessage$2(this, str, str2, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object forceStartQuest(String str, Group group, Continuation<? super Quest> continuation) {
        return process(new ApiClientImpl$forceStartQuest$2(this, str, group, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getChallenge(String str, Continuation<? super Challenge> continuation) {
        return process(new ApiClientImpl$getChallenge$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getChallengeTasks(String str, Continuation<? super TaskList> continuation) {
        return process(new ApiClientImpl$getChallengeTasks$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getContent(String str, Continuation<? super ContentResult> continuation) {
        return process(new ApiClientImpl$getContent$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public ErrorResponse getErrorResponse(HttpException httpException) {
        ResponseBody errorBody;
        q.i(httpException, "throwable");
        retrofit2.Response<?> response = httpException.response();
        if (response != null && (errorBody = response.errorBody()) != null) {
            Converter.Factory factory = this.converter;
            Annotation[] annotationArr = new Annotation[0];
            Retrofit retrofit = this.retrofitAdapter;
            Object obj = null;
            if (retrofit == null) {
                q.z("retrofitAdapter");
                retrofit = null;
            }
            Converter<ResponseBody, ?> responseBodyConverter = factory.responseBodyConverter(ErrorResponse.class, annotationArr, retrofit);
            if (responseBodyConverter != null) {
                try {
                    obj = responseBodyConverter.convert(errorBody);
                } catch (IOException e10) {
                    Analytics.INSTANCE.logError("Json Error: " + this.lastAPICallURL + ",  " + e10.getMessage());
                    return new ErrorResponse();
                }
            }
            q.g(obj, "null cannot be cast to non-null type com.habitrpg.shared.habitica.models.responses.ErrorResponse");
            return (ErrorResponse) obj;
        }
        return new ErrorResponse();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getGroup(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroup$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroup$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.getGroup(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.getGroup(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getGroupInvites(String str, Boolean bool, Continuation<? super List<? extends Member>> continuation) {
        return process(new ApiClientImpl$getGroupInvites$2(this, str, bool, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getGroupMembers(java.lang.String r5, java.lang.Boolean r6, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.members.Member>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.api.ApiService r7 = r4.apiService
            if (r7 != 0) goto L42
            java.lang.String r7 = "apiService"
            qc.q.z(r7)
            r7 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.getGroupMembers(r5, r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r7 = (com.habitrpg.common.habitica.models.HabitResponse) r7
            java.lang.Object r5 = r5.processResponse(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.getGroupMembers(java.lang.String, java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getHallMember(String str, Continuation<? super Member> continuation) {
        return process(new ApiClientImpl$getHallMember$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public HostConfig getHostConfig() {
        return this.hostConfig;
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public String getLanguageCode() {
        return this.languageCode;
    }

    public final Date getLastSubscribeCall() {
        return this.lastSubscribeCall;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMember(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.members.Member> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMember$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMember$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMember$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMember$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMember$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.getMember(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.getMember(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getMemberAchievements(String str, Continuation<? super List<? extends Achievement>> continuation) {
        return process(new ApiClientImpl$getMemberAchievements$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMemberWithUsername(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.members.Member> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMemberWithUsername$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMemberWithUsername$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMemberWithUsername$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMemberWithUsername$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getMemberWithUsername$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.getMemberWithUsername(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.getMemberWithUsername(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getNews(Continuation<? super List<? extends Object>> continuation) {
        return process(new ApiClientImpl$getNews$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getStatus(Continuation<? super Status> continuation) {
        return process(new ApiClientImpl$getStatus$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getTask(String str, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$getTask$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getTasks(Continuation<? super TaskList> continuation) {
        return process(new ApiClientImpl$getTasks$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getTeamPlanTasks(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.TaskList> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTeamPlanTasks$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTeamPlanTasks$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTeamPlanTasks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTeamPlanTasks$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTeamPlanTasks$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.getTeamPlanTasks(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.getTeamPlanTasks(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getTeamPlans(Continuation<? super List<? extends TeamPlan>> continuation) {
        return process(new ApiClientImpl$getTeamPlans$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getUserChallenges(int i10, boolean z10, Continuation<? super List<? extends Challenge>> continuation) {
        if (z10) {
            return process(new ApiClientImpl$getUserChallenges$2(this, i10, z10, null), continuation);
        }
        return process(new ApiClientImpl$getUserChallenges$3(this, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getWorldState(Continuation<? super WorldState> continuation) {
        return process(new ApiClientImpl$getWorldState$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public boolean hasAuthenticationKeys() {
        boolean z10;
        boolean z11;
        if (getHostConfig().getUserID().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (getHostConfig().getApiKey().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object hatchPet(String str, String str2, Continuation<? super Items> continuation) {
        return process(new ApiClientImpl$hatchPet$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object inviteToGroup(String str, Map<String, ? extends Object> map, Continuation<? super List<InviteResponse>> continuation) {
        return process(new ApiClientImpl$inviteToGroup$2(this, str, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object inviteToQuest(String str, String str2, Continuation<? super Quest> continuation) {
        return process(new ApiClientImpl$inviteToQuest$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object joinChallenge(String str, Continuation<? super Challenge> continuation) {
        return process(new ApiClientImpl$joinChallenge$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object joinGroup(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$joinGroup$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$joinGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$joinGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$joinGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$joinGroup$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.joinGroup(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.joinGroup(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object leaveChallenge(String str, LeaveChallengeBody leaveChallengeBody, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$leaveChallenge$2(this, str, leaveChallengeBody, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object leaveGroup(java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.Void> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$leaveGroup$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$leaveGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$leaveGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$leaveGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$leaveGroup$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.api.ApiService r7 = r4.apiService
            if (r7 != 0) goto L42
            java.lang.String r7 = "apiService"
            qc.q.z(r7)
            r7 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.leaveGroup(r5, r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r7 = (com.habitrpg.common.habitica.models.HabitResponse) r7
            java.lang.Object r5 = r5.processResponse(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.leaveGroup(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object leaveQuest(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$leaveQuest$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object likeMessage(String str, String str2, Continuation<? super ChatMessage> continuation) {
        return process(new ApiClientImpl$likeMessage$2(this, str, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object listGroupChat(java.lang.String r5, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.social.ChatMessage>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$listGroupChat$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$listGroupChat$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$listGroupChat$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$listGroupChat$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$listGroupChat$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.api.ApiService r6 = r4.apiService
            if (r6 != 0) goto L42
            java.lang.String r6 = "apiService"
            qc.q.z(r6)
            r6 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.listGroupChat(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r6 = (com.habitrpg.common.habitica.models.HabitResponse) r6
            java.lang.Object r5 = r5.processResponse(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.listGroupChat(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object listGroups(String str, Continuation<? super List<? extends Group>> continuation) {
        return process(new ApiClientImpl$listGroups$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object loginApple(String str, Continuation<? super UserAuthResponse> continuation) {
        return process(new ApiClientImpl$loginApple$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object markPrivateMessagesRead(Continuation<? super w> continuation) {
        Object d10;
        ApiService apiService = this.apiService;
        if (apiService == null) {
            q.z("apiService");
            apiService = null;
        }
        Object markPrivateMessagesRead = apiService.markPrivateMessagesRead(continuation);
        d10 = d.d();
        if (markPrivateMessagesRead == d10) {
            return markPrivateMessagesRead;
        }
        return w.f13270a;
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object markTaskNeedsWork(String str, String str2, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$markTaskNeedsWork$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object openMysteryItem(Continuation<? super Equipment> continuation) {
        return process(new ApiClientImpl$openMysteryItem$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object postGroupChat(String str, Map<String, String> map, Continuation<? super PostChatMessageResult> continuation) {
        return process(new ApiClientImpl$postGroupChat$2(this, str, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object postPrivateMessage(Map<String, String> map, Continuation<? super PostChatMessageResult> continuation) {
        return process(new ApiClientImpl$postPrivateMessage$2(this, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object postTaskDirection(String str, String str2, Continuation<? super TaskDirectionData> continuation) {
        return process(new ApiClientImpl$postTaskDirection$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object postTaskNewPosition(String str, int i10, Continuation<? super List<String>> continuation) {
        return process(new ApiClientImpl$postTaskNewPosition$2(this, str, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object purchaseHourglassItem(String str, String str2, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$purchaseHourglassItem$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object purchaseItem(String str, String str2, int i10, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$purchaseItem$2(this, str, str2, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object purchaseMysterySet(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$purchaseMysterySet$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object purchaseQuest(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$purchaseQuest$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object purchaseSpecialSpell(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$purchaseSpecialSpell$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object readNotification(String str, Continuation<? super List<? extends Object>> continuation) {
        return process(new ApiClientImpl$readNotification$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object readNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation) {
        return process(new ApiClientImpl$readNotifications$2(this, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object registerUser(String str, String str2, String str3, String str4, Continuation<? super UserAuthResponse> continuation) {
        UserAuth userAuth = new UserAuth(null, null, null, null, 15, null);
        userAuth.setUsername(str);
        userAuth.setPassword(str3);
        userAuth.setConfirmPassword(str4);
        userAuth.setEmail(str2);
        return process(new ApiClientImpl$registerUser$2(this, userAuth, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object registrationLanguage(String str, Continuation<? super User> continuation) {
        return process(new ApiClientImpl$registrationLanguage$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object rejectGroupInvite(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$rejectGroupInvite$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object rejectQuest(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$rejectQuest$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeMemberFromGroup(java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.Void> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$removeMemberFromGroup$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$removeMemberFromGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$removeMemberFromGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$removeMemberFromGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$removeMemberFromGroup$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.api.ApiService r7 = r4.apiService
            if (r7 != 0) goto L42
            java.lang.String r7 = "apiService"
            qc.q.z(r7)
            r7 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.removeMemberFromGroup(r5, r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r7 = (com.habitrpg.common.habitica.models.HabitResponse) r7
            java.lang.Object r5 = r5.processResponse(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.removeMemberFromGroup(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object reportMember(String str, Map<String, String> map, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$reportMember$2(this, str, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object reroll(Continuation<? super User> continuation) {
        return process(new ApiClientImpl$reroll$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object resetAccount(Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$resetAccount$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object retrieveInAppRewards(Continuation<? super List<? extends ShopItem>> continuation) {
        return process(new ApiClientImpl$retrieveInAppRewards$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object retrieveInboxConversations(Continuation<? super List<? extends InboxConversation>> continuation) {
        return process(new ApiClientImpl$retrieveInboxConversations$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object retrieveInboxMessages(String str, int i10, Continuation<? super List<? extends ChatMessage>> continuation) {
        return process(new ApiClientImpl$retrieveInboxMessages$2(this, str, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object retrieveMarketGear(Continuation<? super Shop> continuation) {
        return process(new ApiClientImpl$retrieveMarketGear$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object retrievePartySeekingUsers(int i10, Continuation<? super List<? extends Member>> continuation) {
        return process(new ApiClientImpl$retrievePartySeekingUsers$2(this, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object retrieveShopIventory(String str, Continuation<? super Shop> continuation) {
        return process(new ApiClientImpl$retrieveShopIventory$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveUser(boolean r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$1
            if (r6 == 0) goto L13
            r6 = r7
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$1 r6 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$1 r6 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$1
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r6 = r6.L$0
            com.habitrpg.android.habitica.models.user.User r6 = (com.habitrpg.android.habitica.models.user.User) r6
            dc.n.b(r7)
            goto L65
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r1 = r6.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r1 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r1
            dc.n.b(r7)
            goto L55
        L40:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$user$1 r7 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$retrieveUser$user$1
            r1 = 0
            r7.<init>(r5, r1)
            r6.L$0 = r5
            r6.label = r3
            java.lang.Object r7 = r5.process(r7, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r1 = r5
        L55:
            com.habitrpg.android.habitica.models.user.User r7 = (com.habitrpg.android.habitica.models.user.User) r7
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r6 = r1.getTasks(r6)
            if (r6 != r0) goto L62
            return r0
        L62:
            r4 = r7
            r7 = r6
            r6 = r4
        L65:
            com.habitrpg.android.habitica.models.tasks.TaskList r7 = (com.habitrpg.android.habitica.models.tasks.TaskList) r7
            if (r6 != 0) goto L6a
            goto L6d
        L6a:
            r6.setTasks(r7)
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.retrieveUser(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object revive(Continuation<? super Items> continuation) {
        return process(new ApiClientImpl$revive$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object runCron(Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$runCron$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object scoreChecklistItem(String str, String str2, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$scoreChecklistItem$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object seeNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation) {
        return process(new ApiClientImpl$seeNotifications$2(this, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object seenMessages(String str, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$seenMessages$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object sellItem(String str, String str2, Continuation<? super User> continuation) {
        return process(new ApiClientImpl$sellItem$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object sendPasswordResetEmail(String str, Continuation<? super Void> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put(Scopes.EMAIL, str);
        return process(new ApiClientImpl$sendPasswordResetEmail$2(this, hashMap, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object sleep(Continuation<? super Boolean> continuation) {
        return process(new ApiClientImpl$sleep$2(this, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object togglePinnedItem(String str, String str2, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$togglePinnedItem$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object transferGems(String str, int i10, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$transferGems$2(this, str, i10, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object unassignFromTask(String str, String str2, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$unassignFromTask$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object unlinkAllTasks(String str, String str2, Continuation<? super Void> continuation) {
        return process(new ApiClientImpl$unlinkAllTasks$2(this, str, str2, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object unlockPath(String str, Continuation<? super UnlockResponse> continuation) {
        return process(new ApiClientImpl$unlockPath$2(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public void updateAuthenticationCredentials(String str, String str2) {
        HostConfig hostConfig = getHostConfig();
        if (str == null) {
            str = "";
        }
        hostConfig.setUserID(str);
        HostConfig hostConfig2 = getHostConfig();
        if (str2 == null) {
            str2 = "";
        }
        hostConfig2.setApiKey(str2);
        Analytics.INSTANCE.setUserID(getHostConfig().getUserID());
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateChallenge(Challenge challenge, Continuation<? super Challenge> continuation) {
        return process(new ApiClientImpl$updateChallenge$2(this, challenge, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateEmail(String str, String str2, Continuation<? super Void> continuation) {
        boolean u10;
        HashMap hashMap = new HashMap();
        hashMap.put("newEmail", str);
        u10 = v.u(str2);
        if ((!u10) != false) {
            hashMap.put("password", str2);
        }
        return process(new ApiClientImpl$updateEmail$2(this, hashMap, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateGroup(java.lang.String r5, com.habitrpg.android.habitica.models.social.Group r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$updateGroup$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$updateGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$updateGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$updateGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$updateGroup$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.api.ApiService r7 = r4.apiService
            if (r7 != 0) goto L42
            java.lang.String r7 = "apiService"
            qc.q.z(r7)
            r7 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.updateGroup(r5, r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r7 = (com.habitrpg.common.habitica.models.HabitResponse) r7
            java.lang.Object r5 = r5.processResponse(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.updateGroup(java.lang.String, com.habitrpg.android.habitica.models.social.Group, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateLoginName(String str, String str2, Continuation<? super Void> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put("username", str);
        hashMap.put("password", str2);
        return process(new ApiClientImpl$updateLoginName$2(this, hashMap, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateMember(String str, Map<String, ? extends Map<String, Boolean>> map, Continuation<? super Member> continuation) {
        return process(new ApiClientImpl$updateMember$2(this, str, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updatePassword(String str, String str2, String str3, Continuation<? super Void> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put("password", str);
        hashMap.put("newPassword", str2);
        hashMap.put("confirmPassword", str3);
        return process(new ApiClientImpl$updatePassword$2(this, hashMap, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public void updateServerUrl(String str) {
        if (str != null) {
            getHostConfig().setAddress(str);
            buildRetrofit();
        }
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateTag(String str, Tag tag, Continuation<? super Tag> continuation) {
        return process(new ApiClientImpl$updateTag$2(this, str, tag, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateTask(String str, Task task, Continuation<? super Task> continuation) {
        return process(new ApiClientImpl$updateTask$2(this, str, task, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateUser(Map<String, ? extends Object> map, Continuation<? super User> continuation) {
        return process(new ApiClientImpl$updateUser$2(this, map, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object updateUsername(String str, Continuation<? super Void> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put("username", str);
        return process(new ApiClientImpl$updateUsername$2(this, hashMap, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object useSkill(String str, String str2, String str3, Continuation<? super SkillResponse> continuation) {
        return process(new ApiClientImpl$useSkill$2(this, str, str2, str3, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object validateNoRenewSubscription(PurchaseValidationRequest purchaseValidationRequest, Continuation<Object> continuation) {
        return process(new ApiClientImpl$validateNoRenewSubscription$2(this, purchaseValidationRequest, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object validatePurchase(PurchaseValidationRequest purchaseValidationRequest, Continuation<? super PurchaseValidationResult> continuation) {
        if (this.lastPurchaseValidation != null && new Date().getTime() - this.lastPurchaseValidation.getTime() <= 5000) {
            return null;
        }
        return process(new ApiClientImpl$validatePurchase$2(this, purchaseValidationRequest, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object validateSubscription(PurchaseValidationRequest purchaseValidationRequest, Continuation<Object> continuation) {
        Object d10;
        if (this.lastSubscribeCall != null && new Date().getTime() - this.lastSubscribeCall.getTime() <= 60000) {
            return null;
        }
        Object process = process(new ApiClientImpl$validateSubscription$2(this, purchaseValidationRequest, null), continuation);
        d10 = d.d();
        if (process == d10) {
            return process;
        }
        return (Void) process;
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object verifyUsername(String str, Continuation<? super VerifyUsernameResponse> continuation) {
        HashMap hashMap = new HashMap();
        hashMap.put("username", str);
        return process(new ApiClientImpl$verifyUsername$2(this, hashMap, null), continuation);
    }

    private final void showConnectionProblemDialog(int i10, int i11) {
        String string = this.context.getString(i10);
        String string2 = this.context.getString(i11);
        q.h(string2, "getString(...)");
        showConnectionProblemDialog(string, string2);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getTasks(String str, Continuation<? super TaskList> continuation) {
        return process(new ApiClientImpl$getTasks$4(this, str, null), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object useSkill(String str, String str2, Continuation<? super SkillResponse> continuation) {
        return process(new ApiClientImpl$useSkill$4(this, str, str2, null), continuation);
    }

    private final void showConnectionProblemDialog(String str, String str2) {
        WeakReference<BaseActivity> currentActivity;
        BaseActivity baseActivity;
        this.erroredRequestCount++;
        Context context = this.context;
        HabiticaBaseApplication habiticaBaseApplication = null;
        HabiticaBaseApplication habiticaBaseApplication2 = context instanceof HabiticaBaseApplication ? (HabiticaBaseApplication) context : null;
        if (habiticaBaseApplication2 == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof HabiticaBaseApplication) {
                habiticaBaseApplication = (HabiticaBaseApplication) applicationContext;
            }
        } else {
            habiticaBaseApplication = habiticaBaseApplication2;
        }
        if (habiticaBaseApplication == null || (currentActivity = habiticaBaseApplication.getCurrentActivity()) == null || (baseActivity = currentActivity.get()) == null) {
            return;
        }
        baseActivity.showConnectionProblem(this.erroredRequestCount, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.data.ApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getGroupMembers(java.lang.String r5, java.lang.Boolean r6, java.lang.String r7, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.members.Member>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$2
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$2 r0 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$2 r0 = new com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getGroupMembers$2
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.ApiClientImpl r5 = (com.habitrpg.android.habitica.data.implementation.ApiClientImpl) r5
            dc.n.b(r8)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r8)
            com.habitrpg.android.habitica.api.ApiService r8 = r4.apiService
            if (r8 != 0) goto L42
            java.lang.String r8 = "apiService"
            qc.q.z(r8)
            r8 = 0
        L42:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r8.getGroupMembers(r5, r6, r7, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.habitrpg.common.habitica.models.HabitResponse r8 = (com.habitrpg.common.habitica.models.HabitResponse) r8
            java.lang.Object r5 = r5.processResponse(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.ApiClientImpl.getGroupMembers(java.lang.String, java.lang.Boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.ApiClient
    public Object getTasks(String str, String str2, Continuation<? super TaskList> continuation) {
        return process(new ApiClientImpl$getTasks$6(this, str, str2, null), continuation);
    }
}
