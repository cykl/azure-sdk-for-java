/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in TransparentDataEncryptionConfigurations.
 */
public class TransparentDataEncryptionConfigurationsInner {
    /** The Retrofit service to perform REST calls. */
    private TransparentDataEncryptionConfigurationsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of TransparentDataEncryptionConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TransparentDataEncryptionConfigurationsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(TransparentDataEncryptionConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TransparentDataEncryptionConfigurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TransparentDataEncryptionConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryptionConfigurations listByDatabase" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/transparentDataEncryption")
        Observable<Response<ResponseBody>> listByDatabase(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of a database's transparent data encryption configurations. There is only ever one element, named 'current', so GetTransparentDataEncryptionConfiguration should be used instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;TransparentDataEncryptionInner&gt; object if successful.
     */
    public List<TransparentDataEncryptionInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Gets a list of a database's transparent data encryption configurations. There is only ever one element, named 'current', so GetTransparentDataEncryptionConfiguration should be used instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TransparentDataEncryptionInner>> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<List<TransparentDataEncryptionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Gets a list of a database's transparent data encryption configurations. There is only ever one element, named 'current', so GetTransparentDataEncryptionConfiguration should be used instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TransparentDataEncryptionInner&gt; object
     */
    public Observable<List<TransparentDataEncryptionInner>> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<List<TransparentDataEncryptionInner>>, List<TransparentDataEncryptionInner>>() {
            @Override
            public List<TransparentDataEncryptionInner> call(ServiceResponse<List<TransparentDataEncryptionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of a database's transparent data encryption configurations. There is only ever one element, named 'current', so GetTransparentDataEncryptionConfiguration should be used instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TransparentDataEncryptionInner&gt; object
     */
    public Observable<ServiceResponse<List<TransparentDataEncryptionInner>>> listByDatabaseWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByDatabase(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<TransparentDataEncryptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<TransparentDataEncryptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TransparentDataEncryptionInner>> result = listByDatabaseDelegate(response);
                        List<TransparentDataEncryptionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<TransparentDataEncryptionInner>> clientResponse = new ServiceResponse<List<TransparentDataEncryptionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<TransparentDataEncryptionInner>> listByDatabaseDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<TransparentDataEncryptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<TransparentDataEncryptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
