import interactor.CostOfLivingDataSource
import model.CityEntity

class EmptyFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return emptyList()
    }
}