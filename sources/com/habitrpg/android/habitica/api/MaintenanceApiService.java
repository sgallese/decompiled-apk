package com.habitrpg.android.habitica.api;

import com.habitrpg.shared.habitica.models.responses.MaintenanceResponse;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: MaintenanceApiService.kt */
/* loaded from: classes4.dex */
public interface MaintenanceApiService {
    @GET("deprecation-android.json")
    Object getDepricationStatus(Continuation<? super MaintenanceResponse> continuation);

    @GET("maintenance-android.json")
    Object getMaintenanceStatus(Continuation<? super MaintenanceResponse> continuation);
}
