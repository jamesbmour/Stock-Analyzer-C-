import quandl
import pandas as pd
aapl = quandl.get("WIKI/AAPL", start_date="2006-10-01", end_date="2017-07-25")

# Returns first rows of aapl
#firstRows = aapl.head()

# Returns last rows
#lastRows = aapl.tail()

# Describe 'aapl'
#describe =aapl.describe()

# Save data to cvs file
aapl.to_csv('data/aapl_ohlc.cvs')
df = pd.read_csv('data/aapl_ohlc.cvs',header=0,index_col='Date',parse_dates=True)

# Inspect the index
aaplIndex = aapl.index
print(aaplIndex)

# Inspect the Columns
aaplCols = aapl.columns
print(aaplCols)

# Select only the last 10 observations of 'Close'
ts = aapl['Close'][-10:]
# Check the type of 'ts'
type(ts)
print(ts)

# Inspect the first rows of November-December 2006
print("Inspect the first rows of November-December 2006")
print(aapl.loc[pd.Timestamp('2006-11-01'):pd.Timestamp('2006-12-31')].head())

# Inspect the first rows of 2007
print("Inspect the first rows of 2007")
print(aapl.loc['2007'].head())

# Inspect November 2006
print("Inspect November 2006")
print(aapl.iloc[22:43])

# Inspect the 'Open' and 'Close' values at 2006-11-01 and 2006-12-01
print(aapl.iloc[[22,43], [0, 3]])

# Sample 20 rows
sample = aapl.sample(20)

# Print `sample`
print(sample)

# Resample to monthly level
monthly_aapl = aapl.resample('M').mean()

# Print `monthly_aapl`
print(monthly_aapl)

